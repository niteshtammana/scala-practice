package scalaPractice

object recursive {
  def sum(f:Int => Int, x:Int, y:Int):Int = {
    if (x>y) 0 else f(x)+sum(f,x+1,y)
  }
  def fact(x:Int):Int = if(x<2) 1 else x*fact(x-1)
  def sq(x:Int):Int = x*x
  def cu(x:Int):Int = math.pow(x,3).toInt
  
  def main(args:Array[String]){
    println(sum(fact,1,10))
    println(sum(sq,1,10))
    println(sum(cu,1,10))
    //Anonymous functions --> we will directly pass the functioanlity
    println(sum((s:Int) => s*s,1,10))
    println(sum((s:Int) => s%2,1,10))
  }
}