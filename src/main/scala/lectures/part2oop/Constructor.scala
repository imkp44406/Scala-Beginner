package lectures.part2oop

object Constructor extends App {

  class MyClass(var name: String, var age: Int) {
    // Default constructor
    def this() ={
      this("Unknown", -1)
    }
  }

  val obj1 = new MyClass()
  println(obj1.name)
  println(obj1.age)

  val obj2 = new MyClass("sanu", 21)
  println(obj2.name)
  println(obj2.age)

}
