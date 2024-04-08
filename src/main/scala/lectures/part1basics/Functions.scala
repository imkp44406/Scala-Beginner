package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
  a + " " + b ;
  }
  println(aFunction("hello",3));

  def aParameterlessFunction(): Int={
    42
  }
  println(aParameterlessFunction())

  def aRepeatedFunction(s:String, n:Int):String={
    if (n<=1){
      s
    }else{
      s + aRepeatedFunction(s,n-1)
    }
  }
  println(aRepeatedFunction("sanu",3))

  //Auxiliary Functions
  def aBiggerFunction(n:Int):Int={
    def aSmallerFunction(x:Int, y:Int): Int = x+y
    aSmallerFunction(n,n-1)
  }
  println(aBiggerFunction(10))

  /**
   * EXERCISES
   */
  def greetingFunc(name: String, age: Int):String={
    s"Hi my name is ${name} and i am ${age} year old."
  }
  println(greetingFunc("Prasant",25))

  def factorialFunc(n:Int):Int={
    if (n<=1){
      n
    }
    else{
      n*factorialFunc(n-1)
    }
  }
  println(factorialFunc(10))

  def fibonaccoFunc(n:Int):Int={
    if (n<=2 && n>0){
      1
    }else{
      fibonaccoFunc(n-2) + fibonaccoFunc(n-1)
    }
  }
  println(fibonaccoFunc(6))

  def isPrime(n:Int):String={
    var count:Int = 0;
    def counter(x:Int, y:Int):Int={
      if (x>y){
        count
      }else{
        if(n%x == 0) {count+=1}
        counter(x+1,y)
      }
    }
    count = counter(2,n/2)
    if (count==0) "Prime" else "Not Prime"
  }
  println(isPrime(9))

}
