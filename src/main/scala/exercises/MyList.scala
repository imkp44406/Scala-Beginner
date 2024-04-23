package exercises

abstract class MyList[+A] {

  def head():A
  def tail():MyList[A]
  def isEmpty():Boolean
  def add[B>:A](ele:B):MyList[B]
  def printElements():String
  override def toString():String = "[" + printElements() + "]"

}

object Empty extends MyList[Nothing]{
  override def head(): Nothing = throw new NoSuchElementException()

  override def tail(): MyList[Nothing] = throw new NoSuchElementException()

  override def isEmpty(): Boolean = true

  override def add[B>:Nothing](ele: B): MyList[B] = new Cons(ele,Empty)

  override def printElements():String = ""
}

class Cons[A](h:A,t:MyList[A]) extends MyList[A]{

  override def head(): A = this.h

  override def tail(): MyList[A] = this.t

  override def isEmpty(): Boolean = false

  override def add[B>:A](ele: B): MyList[B] = new Cons(ele, this)

  override def printElements(): String = {
    if (this.t.isEmpty()){
       "" + this.h
    }else{
      "" + this.h + "," + this.t.printElements()
    }
  }

}

object ListTest extends App{
  val my_list: MyList[Int] = new Cons(1,Cons(2,Cons(3,Empty)))
  println(my_list.head())
  println(my_list.tail().head())
  println(my_list.add(4).head())
  println(my_list)
}
