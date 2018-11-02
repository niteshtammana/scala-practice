package scalaPractice
import io.StdIn._
object sumOfnumbers {
  def main(args:Array[String]){
    def sumOfNumbers():Int = {
      val input = readInt
      if(input.toInt >= 0){
        input+sumOfNumbers()
      }
      else 0
      }
    print("Enter the numbers you want to sum \n")
    print(sumOfNumbers())
  }
}