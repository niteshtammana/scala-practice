package scalaPractice

object arrayHigherFunction {
  def main(args:Array[String]){
    def operateOnArray(arr:Array[Int], i:Int, f:(Int,Int) => Int) :Int = {
      if(i<arr.length-1){
        f(arr(i),operateOnArray(arr, i+1, f))
      }
      else arr(i)
    }
    val input = Array(1,2,3,4,5)
    print(operateOnArray(input, 0, _+_))
  }
}