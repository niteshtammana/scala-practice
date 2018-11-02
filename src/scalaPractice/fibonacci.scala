package scalaPractice
import io.StdIn._
object fibonacci {
  def fibo(x:Int):Unit = {
    var pre = 0
    var curr = 1
    var res = 0
    print("Fibonacci series is:\t"+pre +"\t" +curr) 
    for(e <- 3 to x){
      res = pre + curr
      pre = curr
      curr = res
      print("\t" + res)
    }
    print("\n" +x+ "th number of the fibonacci series is\t"+res)
  }
  def main (args:Array[String]){
    println("enter number to perform the fibonacci")
    var input = readInt
    fibo(input)
  }
}