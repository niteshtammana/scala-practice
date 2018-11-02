package scalaPractice
import io.StdIn._
object sumOfNumbers2 {
	def main (args:Array[String]){
		def sum():Int = {
				val input = readLine.toLowerCase().trim()
						if(input == "quit") 0
						else input.toInt + sum().toInt
		}
		print("Enter the numbers to sum \n")
		print(sum())
	}
}