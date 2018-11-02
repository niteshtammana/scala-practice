package scalaPractice

/*import scala.Array
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
import scala._
import scala.collection.mutable.ArrayBuffer
import scala.collection.generic._
import scala.collection.{ mutable, immutable }
import mutable.{ ArrayBuilder, ArraySeq }
import scala.reflect.ClassTag
import scala.runtime.ScalaRunTime.{ array_apply, array_update }
*/
object arrayBasics {
  def main(args: Array[String]){
    def mutateArray(array:Array[Int],v:Int,i:Int):Unit = {
      if (i<array.length){
        array(i) =v
        mutateArray(array, v, i+1)  
      }
    }
    val arr = Array(1,1,1,1,1)
    println(arr)
    mutateArray(arr, 10, 0)
    println(arr(1),arr(2),arr(3))
    println(arr.mkString("(",",",")"))
    
  }
}