package lectures.part2oop

object Enum {

  enum Permission{
    case READ,WRITE,EXECUTE,NONE

    def openDoc():Unit={
      if(this == READ){
        println("Reading the document")
      }else{
        println("Permission Denied for reading.")
      }
    }
  }

  val somePermission:Permission = Permission.READ

  // ENUM with constructor
  enum AnotherPermission(bits:Int){
    case READ extends AnotherPermission(4)
    case WRITE extends AnotherPermission(2)
    case EXECUTE extends AnotherPermission(1)
    case None extends AnotherPermission(0)
    def openDoc(): Unit = {
      if (this == READ) {
        println("Reading the document")
      } else {
        println("Permission Denied for reading.")
      }
    }
  }

  object AnotherPermission{
    def returnEnum(bits:Int):AnotherPermission={
      if(bits == 4){
        AnotherPermission.READ
      }else if(bits == 2){
        AnotherPermission.WRITE
      }else if(bits == 1){
        AnotherPermission.EXECUTE
      }else{
        AnotherPermission.None
      }
    }
  }

  val some_another_permission:AnotherPermission = AnotherPermission.returnEnum(2)
  // ORDINAL ---> Index where this particular instance is defined
  val some_permission_index:Int = somePermission.ordinal

  def main(args: Array[String]): Unit = {
    somePermission.openDoc()
    some_another_permission.openDoc()
    println(some_permission_index)
  }

}
