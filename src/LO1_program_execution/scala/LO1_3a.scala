package LO1_program_execution.scala

object LO1_3a {
  def reverseArray(arrIn: Array[Int]):Array[Int]={
    var out:Array[Int]= Array.fill(arrIn.length){0}
    for (i <- 0 until arrIn.length){
      out(out.length-1-i)=arrIn(i)
    }
    out
  }
  def reverse(arrIn: Array[Int]):Unit={
    for (i <- 0 until arrIn.length/2){
      var temp:Int=arrIn(arrIn.length-1-i)
      arrIn(arrIn.length-1-i)=arrIn(i)
      arrIn(i)=temp
    }
  }

  def main(args: Array[String]): Unit = {
    var arr:Array[Int]=Array(1,3,5)
    var arr2=reverseArray(arr)
    println(arr2.mkString(","))
    println("arr")
    println(arr.mkString(","))
    reverse(arr)
    println(arr.mkString(","))
  }
}
