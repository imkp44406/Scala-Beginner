package exercises

object OOBasics_Ex1 extends App {

  val writer:Writer = new Writer("SC","Verma",1965)
  println(writer.fullName())

  val novel:Novel = new Novel("HSE-Physic-Book",1995,writer)
  println(novel.authorAge())
  println(novel.isWrittenByAuthor("SC Verma"))
  val new_novel:Novel = novel.copy(1999)
  println(new_novel.authorAge())

}

class Writer(first_name:String,last_name:String,birth_year:Int){
  def fullName():String={
    this.first_name+" "+this.last_name
  }
  def getBirthYear():Int={
    this.birth_year
  }
}

class Novel(novel_name:String,release_year:Int,author:Writer){
  def authorAge():Int={
    this.release_year - this.author.getBirthYear()
  }
  def isWrittenByAuthor(author:String):Boolean={
  author.toLowerCase == this.author.fullName().toLowerCase
  }
  def copy(new_year:Int):Novel={
    new Novel(this.novel_name,new_year,this.author)
  }
}
