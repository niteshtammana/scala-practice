package scalaPractice

import io.StdIn._
object basicConditional {
  def main (args:Array[String]){
    print("Enter something\n")
    var a = readInt
    if(a>2) println(a-1) else println(a+1)
   
  }
}