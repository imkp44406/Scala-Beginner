package lectures.part1basics

object StringOps extends App {

  val str:String =  "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString:String="12345"
  val aNumber:Int = aNumberString.toInt
  println(aNumber)
  println(s"Prepending ---> ${'a' +: aNumberString}")
  println(s"Appending ---> ${ aNumberString :+ 'z'}")
  println(str.reverse)
  println(str.take(2))

  //Scala Specific

  //S-Interpolater
  println(s"Appending ---> ${ aNumberString :+ 'z'}")

  //F-Interpolater
  val speed:Float=1.2f
  println(f"I can drink ${speed+1}%2.2f liters of Cold Drink")

  //raw Interpolator
  println(raw"Printing escape char \n ------")

}
