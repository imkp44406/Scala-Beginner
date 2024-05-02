package lectures.part3fp

object AnonymousFunctions extends App {

  // Object like syntax
  val doubler:(Int => Int) = new Function1[Int,Int]{
    override def apply(v1: Int): Int = v1*2
  }
  println(doubler(11))

  // ANONYMOUS FUNCTION (LAMBDA)
  val anonymous_doubler:(Int=>Int) = (x:Int) => x*2 //val anonymous_doubler:(Int=>Int) = x => x*2
  println(anonymous_doubler(11))

  // Multiple Parameters
  val adder:((Int,Int)=>Int) = (a,b) => a+b // val adder:((Int,Int)=>Int) = (a:Int,b:Int) => a+b
  println(adder(15,8))

  // No Parameters
  val justDoSomething: ()=> Int = () => 4

  println(justDoSomething) // Print the object location
  println(justDoSomething()) // Print the return value
  //Lambda functions should be call with () always

  //Curly braces with lambda
  val stringToInt: (String=>Int)={(s:String)=>
    s.toInt
  }
  println(stringToInt("17")+7)

  // More Syntactic sugar

  val niceIncrement:Int=>Int = _+1 // Equivalent to x => x+1
  val niceAdder:(Int,Int)=>Int = _ + _ // Equivalent to (x,y) => x+y

  //Curried Anonymous function
  val supperAdder: Int=>Int=>Int = x => y => x+y
  println(supperAdder(10)(15))
}
