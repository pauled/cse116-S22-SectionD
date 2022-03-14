package LO3_functionalProgramming

object FirstOrderFunctions{
  def compare(a:Int,b:Int):Boolean={
    if(a<b) {
      true
    } else {
      false
    }
  }
  def selectionSort(inputData:Array[Int],
                    comparator:(Int,Int)=>Boolean):
      Array[Int]={
    var out:Array[Int]=inputData.clone()
    var min:Int=0
    var temp:Int=0

    for (i<-out.indices){
      min=i
      for (j<-i+1 until out.length){
        if (comparator(out(j),out(min))){
          min=j
        }
      }
      temp=out(i)
      out(i)=out(min)
      out(min)=temp
    }
    out
  }
  def main(args: Array[String]): Unit = {
    var numbers=List(10,-7,-8,5,13)
    //var sorted=numbers.sorted
    //var sorted=numbers.sortWith(compare)
    var sorted=numbers.sortWith((a:Int,b:Int)=>a<b)
    println(sorted)
    var numbers2:Array[Int]=Array(5,3,4)
    var out=selectionSort(numbers2,compare)
    println(out.mkString(" "))
  }
}
