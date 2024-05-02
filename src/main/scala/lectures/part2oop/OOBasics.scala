package lectures.part2oop

object OOBasics extends App {

  val person:Person = new Person("Sanu",26)

  println(person.age)
  person.age = 25
  println(person.age)
  person.greet()
  person.greet("Danial")

}
// Constructor
class Person(name:String,var age:Int){
  var x:Int=2
  var age2:Int=this.age
  println(1+1)

  def greet(): Unit = {
    println(s"Hi I am ${name}")
  }
  //Overloading
  def greet(name:String):Unit={
    println(s"${this.name} said hi to ${name}")
  }

  //Constructor Overloading
  def this(name:String)=this(name,0)
  def this()=this("Sanu")
}
//Class Parameters are NOT Fields
