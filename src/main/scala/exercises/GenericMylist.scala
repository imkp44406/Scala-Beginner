package exercises

abstract class GenericMylist[+A] {

  def head():A
  def tail():GenericMylist[A]
  def isEmpty():Boolean
  def add[B >: A](ele:B):GenericMylist[B]
  def printElements():String

  override def toString: String = "[" + printElements() + "]"
}

object GenericEmpty extends GenericMylist[Nothing] {
  override def head(): Nothing = throw new NoSuchElementException()
  def tail(): GenericMylist[Nothing] = throw new NoSuchElementException()
  def isEmpty(): Boolean = true
  def add[B>:Nothing](ele: B): GenericMylist[B] = new GenericCons(ele,GenericEmpty)

  override def printElements(): String = ""
}

class GenericCons[+A](h:A,t:GenericMylist[A]) extends GenericMylist[A] {
  override def head(): A = this.h
  def tail(): GenericMylist[A] = this.t
  def isEmpty(): Boolean = false
  def add[B >: A ](ele: B): GenericMylist[B] = new GenericCons(ele, this)

  override def printElements(): String = {
    if(this.t.isEmpty()){
      "" + this.h
    }else{
      "" + this.h + "," + this.t.printElements()
    }
  }
}

object TestList extends App {
  val my_int_list:GenericMylist[Int] = new GenericCons(1,new GenericCons(2,new GenericCons(3,GenericEmpty)))
  println(my_int_list)

  val my_string_list: GenericMylist[String] = new GenericCons[String]("Hello",new GenericCons[String]("World",GenericEmpty))
  println(my_string_list)
}
