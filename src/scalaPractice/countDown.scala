package scalaPractice

object countDown {
  def main (args:Array[String]){
    def countDown(number:Int):Unit = {
      if(number>0){
        println(number)
        countDown(number-1)
      }
    }
    countDown(6)
  }
}