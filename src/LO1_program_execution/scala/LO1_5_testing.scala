package LO1_program_execution.scala

object LO1_5_testing {
  def main(args: Array[String]): Unit = {
    var temp:Double=0.0
    temp+=.1
    temp+=.1
    temp+=.1
    println("temp: "+temp)
    println("They are equal: "+(Math.abs(temp-.3)<.00000001))

    var list1:List[Int]=List(1,2,3)
    var list2:List[Int]=List(3,2,1)
    println("lists equal: "+(list1.sorted ==list2.sorted))

    var map1:Map[Int,Int]=Map(
      1->2,
      2->3,
      3->4
    )
    var map2:Map[Int,Int]=Map(
      2->3,
      3->4,
      1->2
    )
    println("Maps equal: "+(map1==map2))
  }
}
