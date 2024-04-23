package lectures.part2oop

object Exceptions extends App {

    val str:String = null
//  println(str.length)
//  This will crass with Null pointer Exception
//  Throwing & Catching Exception

//    throw new NullPointerException() // Return Nothing

// Throwable classes extends the Throwable Class
// Exceptions and Errors are two major Throwable sub-types

// 2. How to Catch Exceptions

   def getInt(ele:Boolean):Int={
     if(ele){
      throw new RuntimeException("RunTime Exception")
    }else{
      30
    }
   }

  val potentialFail = try {
    getInt(false)
  } catch {
    case e: NullPointerException => 43
  } finally {
    //Always Executed
    //Optional
    //Doesn't Affect the return type of Try Catch Block
    //Use Finally only for Side effect.
    println("finally")
  }
  println(potentialFail)

// 3. Custom Exception

class MyException(str:String) extends Exception(str)
val cus_exception = new MyException("My Custom Exception")

try{
  throw cus_exception
}catch {
  case e: Exception => println(e.getMessage)
}

}
