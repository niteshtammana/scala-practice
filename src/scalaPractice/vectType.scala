package scalaPractice

object vectType {
  def main(args:Array[String])
  {
    type vect = (Double,Double)
    def sum(a1:vect,a2:vect):vect = ((a1._1+a2._1),(a1._2+a2._2))
    println("the sum of the vectors are:")
    print(sum((2,3),(3,4)))
  }
}