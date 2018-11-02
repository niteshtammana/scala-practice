package scalaPractice
import io.StdIn._
object sumAndCount {
  def main(args:Array[String])
  {
    def sumAndCount():(Int,Int) = {
      val input = readLine.toLowerCase().trim()
      if(input == "quit") (0,0)
      else
      {
        val (sum,count) = sumAndCount()
        (input.toInt+sum, count+1)
      }
    }
    
    print("enter numbers \n")
    //print(sumAndCount())
    val (s,c) = sumAndCount()
    println(s,c)
    print(s/c.toDouble)
  }
}