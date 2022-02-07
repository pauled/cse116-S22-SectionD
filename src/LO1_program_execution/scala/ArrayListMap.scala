package LO1_program_execution.scala

object ArrayListMap {
  def main(args: Array[String]): Unit = {
    var arr:Array[Int]=Array(2,3,4)
    var x:Int = arr(1)
    println(x)
    arr(2)=20

    for (element <- arr){
      println(element)
    }
    for (index <- 0 to arr.length-1){
      arr(index)-=3
    }
    for (index <- arr.indices){
      println(arr(index))
    }

    var list:List[Int]=List(4,5,6)
    println(list.head)
    println(list.apply(1))
    list=list:+50
    println()
    list=70::list
    for (element <-list) {
      println(element)
    }

    var myMap:Map[Int,Int]=Map(2->4,3->9,4->16)
    myMap=myMap+(5->25)
    println(myMap(5))
    println(myMap.getOrElse(100,"wrong?"))
    for ((key,value)<-myMap){
      println("Key: "+key+" value: "+value)
    }
  }
}
