package lectures.part2oop

object Generics extends App {

  //GENERIC Classes
  //traits are also can be of type generics
  class Mylist[+A]{
    //Use A Inside the class
    def add[B >: A](ele:B):Mylist[B] = ???
  }
  class Mymap[key,value]

  val int_list = new Mylist[Int]
  val str_list = new Mylist[String]

  //GENERIC methods
  object Mylist{
    def empty[A](): Mylist[A] = ???
  }

//  val int_empty_list = Mylist.empty[Int]()

  //Variance Problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. YES, List[CAT] extends List[ANIMAL] == COVARIANCE ---> LIST[ANIMAL] == LIST[CAT]
  class CovarianceList[+A]

  val cat:Animal = new Cat
  val animal_list:CovarianceList[Animal] = new CovarianceList[Cat]
  // cat_list.add(new Dog) --- Hard question => We return a list of animal

  //2. NO, INVARIANCE ---> LIST[ANIMAL] == LIST[ANIMAL] Only
  class InvarianceList[A]
//  val animal_only_list: InvarianceList[Animal] = new InvarianceList[Cat] ///Throws Error as it is not possible
  val animal_only_list: InvarianceList[Animal] = new InvarianceList[Animal]

  //3. HELL NO, CONTRAVARIANCE
  class ContravarianceList[-A]
  val cat_list: ContravarianceList[Cat] = new ContravarianceList[Animal]

  //bounded type
  class Cage[A <: Animal](animal:A)
  val cage = new Cage(new Dog)
  class Car
//  val car_cage = new Cage(new Car) Found:    lectures.part2oop.Generics.Car //Required: lectures.part2oop.Generics.Animal
}
