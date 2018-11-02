package scalaPractice

object demo {

def main(args:Array[String]){

case class student(var name:String = "Nitesh", var id:Int = 7){
val s1 = new student()
val s2 = student("Ram",2)
print(s1)
print(s2)
}
}                                                 //> main: (args: Array[String])Unit
}