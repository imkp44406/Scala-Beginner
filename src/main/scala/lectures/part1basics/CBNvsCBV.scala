package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x:Long):Unit={
    println(s"Call By Value ${x}")
    println(s"Call By Value ${x}")
  }

  def callByName(x: => Long): Unit = {
    println(s"Call By Name ${x}")
    println(s"Call By Name ${x}")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

}
