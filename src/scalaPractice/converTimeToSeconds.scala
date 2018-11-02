package scalaPractice
import io.StdIn._

object converTimeToSeconds {
  def main(args:Array[String]){
    println("Enter time in hours minutes and seconds with : in between each\n")
    var time = readLine
    var minutes = time.indexOf(":")
    var seconds = time.lastIndexOf(":")
    var hours = time.substring(0, minutes).toInt
    var min = time.substring(minutes+1, seconds).toInt
    var sec = time.substring(seconds+1).toInt
    var convertedSeconds = hours*3600 + min*60 +sec
    println(s"hours : $hours  minutes : $min  seconds : $sec")
    println("Total Seconds are\t" + convertedSeconds)
  
  }
}