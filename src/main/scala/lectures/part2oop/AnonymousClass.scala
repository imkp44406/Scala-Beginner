package lectures.part2oop

object AnonymousClass extends App {

  abstract class Animal{
    def eat():String
  }

  val new_animal:Animal = new Animal {
    override def eat(): String = "AnonymousClass ---> Animal Eating"
  }
  /**
   * IMPLEMENTATION
   * class AnonymousClass$$anon$1 extends Animal{
   *    overwrite def eat():String = "AnonymousClass ---> Animal Eating"
   * }
   *
   * val new_animal:Animal = new  AnonymousClass$$anon$1()
   */
  println(new_animal.getClass)

  class Person(name:String){
    def sayHello():Unit = println(s"Hi My Name Is ${this.name} and Hello to every One")
  }

  val new_person:Person = new Person("Sanu"){
    override def sayHello(): Unit = // super.sayHello()
      println(s"Hi My Name Is sanu and Hello to every One inside AnonymousClass")
  }

  new_person.sayHello()

}
