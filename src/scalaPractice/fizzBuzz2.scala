package scalaPractice

object fizzBuzz2 {
  def fizzBuzz(x:Int):Unit = {
    (x%3,x%5)  match {
      case (0,0) => println("FizzBuzz")
      case (0,_) => println("Fizz")
      case (_,0) => println("Buzz")
      case _ => println(x + "doesn't belong to FizzBuzz family")
    }
  }
  def main(args:Array[String]){
   println("Enter the number to check if it belongs to fizz buzz family")
   val input = io.StdIn.readInt()
   fizzBuzz(input)
  }
}

