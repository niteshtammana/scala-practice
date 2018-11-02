package scalaPractice
import io.StdIn._
object fizzBuzz {
  def main(args:Array[String])
  {
    def fizzBuzz(x:Int):Unit = {
      (x%3,x%5) match {
        case (0,0) => println("FizzBuzz")
        case (0,_) => println("Fizz")
        case (_,0) => println("Buzz")
        case (_,_) => println(x + "not a fizzBuzz family")
      }   
    }
    /*println("Enter the number")
    val input = readInt
    fizzBuzz(input)*/
    
    def fizzBuzz2(i:Int):Unit = {
      if(i<100){
        (i%3,i%5) match {
          case (0,0) => println("FizzBuzz")
          case (0,_) => println("Fizz")
          case (_,0) => println("Buzz")
          case (_,_) => println(i + " not a fizzBuzz family")
        }
        fizzBuzz2(i+1)
      }
    }
    fizzBuzz2(1)
  }
}