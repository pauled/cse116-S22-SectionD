package LO1_program_execution.scala

object Conditional {
  def computeSize(num: Double) : String ={
    val large: Double=60.0
    val medium: Double=30.0
    var out:String=""
    if (num>=large){
      out="large"
    } else if (num>=medium) {
      out="medium"
    } else {
      out="small"
    }
    out
  }
  def main(args: Array[String]): Unit = {
    println(computeSize(70.0))
    println(computeSize(50.0))
    println(computeSize(10.0))
  }
}
