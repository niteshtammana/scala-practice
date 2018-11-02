package scalaPractice

object countFromTo {
  def main(args:Array[String]){
    def countFromToo(from:Int,to:Int):Unit = {
    if(from<to){
      println(from)
      countFromToo(from+1, to)}
    }
    countFromToo(1,10)
  }
}