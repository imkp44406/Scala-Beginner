package playground

object Playground {
  def main(args: Array[String]): Unit = {
    println("I am ready to learn scala!")
    val person:Person = new Person("Sanu")
    person.printName()

    val employee:Person = new Employee("Prasant","TCS")
    employee.printName()
//    employee.printNameWithComp()
  }

}

class Person(name:String){
  def printName():Unit= println(s"My name is ${this.name} and i am a person")
}

class Employee(name:String,Company:String) extends Person(name){

   def printNameWithComp(): Unit = println(s"My name is ${this.name} and i am an Employee in ${this.Company}")

}
