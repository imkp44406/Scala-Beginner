package lectures.part2oop

object Inheritance extends App {

  class Animal{
    val creature:String = "Wild"
    def eat():Unit= {
      println("Eating ---> Animal Class")
    }

    private def eat1(): Unit = {
      println("Eating-1 ---> Animal Class")
    }

    protected def eat2(): Unit = {
      println("Eating-2 ---> Animal Class")
    }
  }

  class Cat extends Animal{
    def crunch():Unit={
//      super.eat1()   # Not able to access private members. accessible only in the same class
      super.eat2()    /* protected members are accessible   with in the same class or with-in child class*/
      println("Crunching ---> Cat Class")
    }
  }

  val cat1:Cat = new Cat()
  cat1.eat()
//  cat1.eat1() # Not able to access private members. accessible only in the same class
//  cat1.eat2() /* protected members are accessible   with in the same class or with-in child class*/
  cat1.crunch()

  // Constructors overloading
  class Person(name:String,age:Int){
    def this() = {
      this("Unknown",-1)
    }
    def this(name:String) = {
      this(name, -1)
    }
  }
//  class Adult(name:String,age:Int,idCard:String) extends Person
  class Adult(name:String,age:Int,idCard:String) extends Person(name)

  //Overwriting
  class Dog(override val creature: String) extends Animal {
//    override val creature: String = "Domestic"
    override def eat(): Unit = println("Crunch Crunch ------> Dog overwrite methode")
  }

  val dog:Dog = new Dog("Domestic")
  dog.eat()
  println(dog.creature)

  // Type Substitution (broad: polymorphism)
  val unknownAnimal:Animal = new Dog("K9")
  unknownAnimal.eat()

  // Prevent Method Overwriting
  //1 - Use "final" keyword on member
  //2 - Final class can't be inherited
  //3 - "sealed" the class = extend the class in this file but Prevent extends in other files.

}
