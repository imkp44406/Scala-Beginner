package lectires.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42;
  println(x);

  /**
   * Key Points
   * x =2;
   * Vals are immutables
   * Compiler can infer types
   */

  val str: String = "This is a string";

  val bol: Boolean = true;
  val c:Char = 'C';
  val s: Short  = 4562;
  val l:Long = 5565676876565L;
  val f:Float = 2.6f;
  val d:Double = 35.778;

  /**
   * Variables
   * Variable in functional programming called side effects
   */

  var variable: Int = 4;
  variable = 6;


}
