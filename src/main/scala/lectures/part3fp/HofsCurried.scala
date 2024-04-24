package lectures.part3fp

object HofsCurried extends App {

  val supperFunction: (Int,(String,(Int=>Boolean))=>Int) => (Int=>Int) = null
  //Higher Order Functions
  //Ex - Map,Flatmap,Filter

  //Function that apply a function n time over a value x
  //nTimef(f,n,x)
  //nTimef(f,3,x) === f(f(f(x))) === nTimef(f,2,f(x))
  //nTimef(f,n,x) === nTimef(f,n-1,f(x))
  def nTimef(f:Int=>Int,n:Int,x:Int):Int={
    if(n==0) x
    else nTimef(f,n-1,f(x))
  }
  val incrementor: Int=>Int = x=>x+1
  println(nTimef(incrementor,10,1))

  //nTimefBetter(f,n) : (Int=>Int)
  //ntb(f,n)=>x=>f(f(.......(x)))
  //Increment10 = ntb(incrementor,10)=>x=>incrementor(incrementor(....incrementor(x)))
  //val y = increment10(1)

  def nTimefBetter(f:Int=>Int,n:Int):(Int=>Int)={
    if (n<=0) (x:Int)=> x
    else (x:Int) => nTimefBetter(f,n-1)(f(x))
  }

  val plus10 = nTimefBetter(incrementor,10)
  println(plus10(1))

  //Curried function
  val superAdder: Int=>(Int=>Int) = (x:Int)=>(y:Int) =>x+y
  val add3 = superAdder(3) /// (y:Int) => 3+y
  println(add3(4))
  println(superAdder(3)(4))

  // Functions with multiple parameters list
  def doubleFormater(fmt:String)(value:Double):String=fmt.format(value)

  val standardFormat: Double=>String = doubleFormater("%4.2f")
  val preciseFormat: Double=>String = doubleFormater("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
