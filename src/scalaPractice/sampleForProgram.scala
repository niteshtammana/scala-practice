package scalaPractice

import io.StdIn._

object sampleForProgram {
  def main(args:Array[String])
  {
    print("enter something\n")
    val a = readLine
      val b =  a.indexOf(":",1)
      val c = a.indexOf(":", 4)
      val d = a.lastIndexOf(":")
      println(b)
      println(c)
      println(d)
     
  }
}