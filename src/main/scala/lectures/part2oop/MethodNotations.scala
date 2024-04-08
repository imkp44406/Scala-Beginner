package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(name:String,favorite_movie:String,age:Int=0){
    def likes(movie:String):Boolean=movie==this.favorite_movie
    def +(person:Person):String=s"${this.name} hangsout with ${person.getName()}"
    def +(nick_name:String):Person=new Person(s"${this.name} (${nick_name})",this.favorite_movie)
    def isalive:Boolean=true
    def apply():String=s"Hi, My name is ${this.name} and My favorite movies is ${this.favorite_movie}"

    def unary_+ :Person=new Person(this.name,this.favorite_movie,this.age+1)
    def learn(sub:String):String=s"${this.name} learns ${sub}"
    def learnScala:String=this.learn("Scala")
    def apply(count:Int):String=s"${this.name} watched ${this.getFavMovie()} ${count} times."

    def getName():String=this.name
    def getFavMovie():String=this.favorite_movie
    def getAge():Int=this.age
  }

  val sanu:Person=new Person("Sanu","Inception")
  println(sanu.likes("Inception"))
  println(sanu likes "Inception") //infix/operator Notation (Only works with single argument method)

  val sagar:Person=new Person("Sagar","Fight Club")
  println(sanu + sagar)
  println(sanu.+(sagar))
  println((sanu + "The Good Boy")())

  println(1+1)
  println(1.+(1)) // ALL OPERATORS ARE METHODS

  //Prefix notation
  val x = -1
  val y = 1.unary_- //Unary_prefix only works with -,+,~,!

  //Postfix notation
  println(sanu.isalive)
  println(sanu isalive)

  //Apply
  println(sanu.apply())
  println(sanu())

  println(sanu.getAge())
  println((+sanu).getAge())

  println(sanu learnScala)

  println(sanu(2))


}
