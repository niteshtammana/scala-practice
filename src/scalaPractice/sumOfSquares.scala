package scalaPractice
import io.StdIn._
object sumOfSquares {
  def main (args:Array[String]){
    def squaresSum(num : BigInt):BigInt = if(num<2) 1 else num*num + squaresSum(num-1)
    
    print("Enter number to perform square of numbers\n")
    val number = readInt
    println("squares of given number is "+squaresSum(number))
  }
}