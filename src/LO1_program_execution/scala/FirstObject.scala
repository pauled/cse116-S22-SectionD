package LO1_program_execution.scala

object FirstObject {
  def multiplyByTwo(input: Double): Double = {
    input*2.0
  }
  def computeTrue(str: String): Double ={
    val splits:Array[String]=str.split(";")
    var trues:Double=0
    var total:Double=0

    for (value <- splits){
      var tempBool:Boolean=value.toBoolean
      if (tempBool){
        trues+=1
      }
      total+=1
    }
    println(splits(0))
    trues/total
  }

  def main(args: Array[String]): Unit = {
    var testInput:String = "true;false;true;true;false"
    var percentTrue:Double=computeTrue(testInput)
    println(percentTrue)
    print(5/2)
    /*
    var anInt:Int = 13 //32 bits
    var aLong: Long = 8 //64 bits
    var aDouble: Double = 5.8 //64 bits 1 sign 11 exponent 52 fraction
    var aBoolean: Boolean = true
    var aString: String = "6.4"

    var aDouble2: Double = aString.toDouble
    var aString2: String=anInt.toString

    anInt+=5

    for (i <- 0 to 4){
      println("i=="+i)
    }

    var x: Double=21.0
    var result=multiplyByTwo(x)
    println(result)*/
  }
}
