package exercises

object FunctionalProgramming extends App {

  val myList:List[Int] = List(1,2,3,4)

  val printElement: Int=>Unit = (x:Int)=>println(x)
  myList.foreach(printElement)

}
