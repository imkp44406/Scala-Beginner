package lectires.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n:Int):Int={
    if (n<=1){
      1
    }else{
      n*factorial(n-1)
    }
  }
  println(factorial(10));
//  println((factorial(50000)))

  def anotherFactorial(n:Int):BigInt={
@tailrec
    def factHelper(x:Int,y:BigInt):BigInt={
      if (x<=1) y
      else factHelper(x-1,x*y)
    }
    factHelper(n,1)
  }
  println(anotherFactorial(10))
//  println(anotherFactorial(5000))
@tailrec
  def stringConcat(s:String,n:Int,res:String):String={
    if (n<=1) res
    else stringConcat(s,n-1,s+"-"+res)
  }
  println(stringConcat("sanu",10,"sanu"))
  @tailrec
  def isPrime(n:Int,i:Int,c:Int):Int={
    if (i>n/2) {
      c
    }else{
      isPrime(n,i+1,if (n%i == 0) c+1 else c)
    }
  }
  println(if (isPrime(37,2,0) == 0) "Prime" else "Not prime")
@tailrec
  def fibonacci(n:Int,x:Int = 1,y:Int = 1,i:Int = 3):Int= {
  if (i > n) y
  else fibonacci(n, y, x + y, i + 1)
  }
  println(fibonacci(8))
  //1,1,2,3,5,8,13
}
