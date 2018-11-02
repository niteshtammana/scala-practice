package scalaPractice

import io.StdIn._
object factorialProblem {
  def main (args:Array[String]){
    def factorial (x:BigInt):BigInt = if(x<2) 1 else x*factorial(x-1)
    //print("Enter the number you want to perform factorial function\n")
    //val factNumber = readInt
    //println("The factorial of the given number is \t :" + factorial(factNumber))
    
    def factorialMatch(x:Int):Int = x match{
      case 0 => 1
      case _ => x*factorialMatch(x-1)
    }
    print("Enter the number you want to perform factorial function\n")
    val factNumber1 = readInt
    println("The factorial of the given number is \t :" + factorialMatch(factNumber1))
    
  }
}