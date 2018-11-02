package scalaPractice
import io.StdIn._

object combination {
  def fact(a:Int):Int = if(a<2) 1 else a*fact(a-1)
  def ncr(x:Int,y:Int):Int = {
    if(x<y)
      0
    else
    fact(x)/(fact(x-y)*fact(y))
  }
  def main(args:Array[String]){
    println("Enter x value to perform nCr operation")
    val x = readInt
    println("Enter y value to perform nCr operation")
    val y =readInt
    println("nCr of the given values is :\t"+ncr(x,y))
   
  }
}