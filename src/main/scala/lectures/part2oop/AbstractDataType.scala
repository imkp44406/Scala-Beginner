package lectures.part2oop

object AbstractDataType extends App{

  // Class or files that contains unimplemented methods called abstract class/methods
  //Abstract class can't be instantiated

  abstract class Animal(){
    val creatureType:String = "Wild"
    def eat:Unit

  }
  class Dog extends Animal{
    // overwrite keywords are not required while overwriting abstract elements
    override val creatureType: String = "Dog"
    override def eat: Unit = println("Eating ------> Dog class")
  }

  //traits
  trait Carnivore{
    def eat(animal:Animal): Unit
    val like2Eat:String = "Meat"

  }

  trait Coldblooded
  class Crocodile extends Animal with Carnivore with Coldblooded{
    override def eat: Unit = println("Overwriting Animal Eat Method")

    override def eat(animal: Animal): Unit = println(s"I am a crocodile and i like to eat ${animal.creatureType}")
  }

  val dog :Dog = new Dog
  val croc: Crocodile = new Crocodile
  croc.eat(dog)

  //Difference between abstract class and Traits
  // 1 - We can't have constructors in traits (Scala-3 it is possible)
  // 2 - We can only extent one class but multiple traits can be extended;

}
