package exercises

class OverFlowException(msg:String) extends Exception(msg)
class UnderFlowException(msg:String) extends Exception(msg)
class MathCalculationException(msg:String) extends Exception(msg)
object PocketCalculator{
  def add(x:Int,y:Int): Int = {
    if(x+y > Int.MaxValue){
      throw new OverFlowException("Result Exceed Maximum Integer Value")
    }else{
      x+y
    }
  }
  def subtract(x:Int, y:Int):Int={
    if (x - y < Int.MinValue) {
      throw new UnderFlowException("Result Exceed minimum Integer Value")
    } else {
      x - y
    }
  }

  def multiply(x: Int, y: Int): Int = {
    x*y
  }
  def divide(x: Int, y: Int): Double = {
    if (y == 0) {
      throw new MathCalculationException("Divisible by 0 Exception")
    } else {
      x.toDouble / y.toDouble
    }
  }
  def main(args: Array[String]): Unit = {
    try{
      println(add(1,2))
      println(subtract(5,4))
      println(multiply(5,2))
      println(divide(5,0))
    }catch{
      case e:Exception => println(e.getMessage)
    }
  }
}
