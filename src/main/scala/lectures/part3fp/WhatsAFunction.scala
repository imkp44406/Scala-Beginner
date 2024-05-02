package lectures.part3fp

object WhatsAFunction {

  //Functions are 1st class element like variables
  // ALL SCALA FUNCTIONS ARE OBJECTS
trait MyFunction[A,B]{
    def apply(ele:A):B
  }

  def main(args:Array[String]): Unit = {
    val doubler = new MyFunction[Int,Int]{
      override def apply(ele: Int): Int = ele*2
    }
    println(doubler(5))

    // Function Types = Function1[A,B] possible upto 22
    val stringToIntConvertor: (String => Int) = new Function[String,Int]{
      override def apply(v1: String): Int = v1.toInt
    }
    println(stringToIntConvertor("5")+10)
    // Function2[A,B,C]
    val addition: ((Int,Int)=>Int) = new Function2[Int,Int,Int]{
      override def apply(v1: Int, v2: Int): Int = v1+v2
    }
    println(addition(100,40))
    // Function Types Function2[A,B,R] = (A,B) => R

    val concatinate:((String,String)=>String)=new Function2[String,String,String] {
      override def apply(v1: String, v2: String): String = v1.concat(v2)
    }
    println(concatinate("Prasant"," Sahu"))

    // Curried Function
    // Function1[Int,Function1[Int,Int]]
    val superAdder:Function1[Int,Function1[Int,Int]] = new Function[Int,Function1[Int,Int]]{
      override def apply(v1: Int): Function1[Int,Int] ={
        new Function[Int,Int]{
          override def apply(v2: Int): Int = v1+v2
        }
      }
    }

    val adder3 = superAdder(3)
    println(adder3(4))
    println(superAdder(3)(4))

  }

}
