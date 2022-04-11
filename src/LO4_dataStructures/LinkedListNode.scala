package LO4_dataStructures

class LinkedListNode[T] (var value:T,
                         var next:LinkedListNode[T]) {
  //size()
  def size():Int={
    /*var count=1
    var current:LinkedListNode[T]=this
    while (current.next!=null){
      count+=1
      current=current.next
    }
    count*/
    if (this.next==null){
      1
    } else {
      1+this.next.size()
    }
  }

  //print
  override def toString: String = {
    if (this.next==null){
      this.value.toString
    } else {
      this.value.toString+", "+this.next.toString
    }
  }
  //getElement(loc)
  def getElement(loc:Int):LinkedListNode[T]={
    if (loc==0) {
      this
    } else if(this.next==null){
      null
    } else {
      this.next.getElement(loc-1)
    }
  }
  //add/remove
  //find(element)
}
object runLLN{
  def main(args: Array[String]): Unit = {
    var myList:LinkedListNode[Int]=new
      LinkedListNode[Int](1,null)
    myList=new LinkedListNode[Int](3,myList)
    myList=new LinkedListNode[Int](5,myList)
    println(myList.size())
    println(myList)
    println(myList.getElement(34))
  }
}
