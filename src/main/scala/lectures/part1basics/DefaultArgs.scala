package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App{
  @tailrec
  def factorial(n:Int,res:Int=1):Int={
    if (n<=1){
      return res
    }else{
      factorial(n-1,res*n)
    }
  }

  println(factorial(5))

  /*
  Name The arguments to resolve error while passing the arguments
  */
  def savePic(format:String="jpg",width:Int=1920,height:Int=1080):Unit= {
    print("saving Pic")
  }
  savePic(height = 900,format = "gif")

}
