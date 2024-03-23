package lectires.part1basics

object Expressions extends App{

  var x: Int = 1+2; //Expressions
  print(x);

  println(2+3*4); // Math expression
  /**
   * Math Operators :- + - * /
   * Bit wise operators :- & | ^ << >> >>>(Right shift with zero extension)
   * Relational :- == != > >= < <=
   * Boolean : && || !
   */

  x = 2;
  x +=5;
  println(x)

  /**
   * Instructions - Ask program to do something
   * Expression - VALUE
   */

  //IF  expression
  val aCondition: Boolean = true;
  val aConditionvalue: Int = if(aCondition) 5 else 3 ; //IF Expression
  println(aConditionvalue)

  var i:Int = 0;
  while (i<=10){
    println(i)
    i+=1
  }

  val aWierdvariable = (x = 3) // Unit === Void
  println(aWierdvariable)

  /**
   * Side effects are : Printing, Loop, Reassigning of Vars
   * Everything in Saca is an Expression ie it will return some value or unit
   */

//  Code Block

  val aCodeblock = {
    val y = 2
    val z = y+1

    if (z > 2) "hello" else "Goodbye"
  }
  println(aCodeblock)
}
