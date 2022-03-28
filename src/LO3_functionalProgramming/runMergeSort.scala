package LO3_functionalProgramming

object runMergeSort {
  def mergeSort[T](inputData:List[T],comparator:(T,T)=>Boolean):List[T]={
    if(inputData.length<2){
      inputData
    } else {
      val mid=inputData.length/2
      val (left,right)=inputData.splitAt(mid)
      val leftSorted=mergeSort(left,comparator)
      val rightSorted=mergeSort(right,comparator)
      merge(leftSorted,rightSorted,comparator)
    }
  }
  def merge[T](left:List[T],right:List[T],comparator:(T,T)=>Boolean):
    List[T]={
    var leftPointer=0
    var rightPointer=0
    var sortedList:List[T]=List()
    while(leftPointer<left.length && rightPointer<right.length){
      if (comparator(left.apply(leftPointer),right.apply(rightPointer))){
        sortedList=sortedList:+left.apply(leftPointer)
        leftPointer+=1
      } else {
        sortedList=sortedList:+right.apply(rightPointer)
        rightPointer+=1
      }
    }
    while (leftPointer<left.length){
      sortedList=sortedList:+left.apply(leftPointer)
      leftPointer+=1
    }
    while (rightPointer<right.length){
      sortedList=sortedList:+right.apply(rightPointer)
      rightPointer+=1
    }
    sortedList
  }

  def main(args: Array[String]): Unit = {
    var data:List[Int]=List(11,2,7,5,8,9,22,65,0,-3)
    var sortedData=mergeSort(data,(a:Int,b:Int)=>a<b)
    println(sortedData)
    println(mergeSort(List(),(a:Int,b:Int)=>a<b))
  }
}
