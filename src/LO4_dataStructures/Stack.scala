package LO4_dataStructures

class Stack [A]{
  var top:LinkedListNode[A]=null

  //push
  def push(element:A):Unit={
    this.top=new LinkedListNode[A](element,this.top)
  }
  //pop
  def pop():A={
    val toReturn=this.top.value
    this.top=this.top.next
    toReturn
  }

  override def toString: String = {
    this.top.toString
  }
}
object runStack{
  def main(args: Array[String]): Unit = {
    val stack=new Stack[Int]()
    stack.push(2)
    stack.push(4)
    stack.push(8)
    println(stack)
    val temp=stack.pop()
    println(temp)
    println(stack)

    val deck:Stack[Card]=new Stack()
    val suits:Array[String]=Array("Hearts","Clubs",
    "Diamonds","Spades")
    for (suit <- suits){
      for (i <- 1 to 13) {
        deck.push(new Card(suit,i))
      }
    }
    println(deck)
  }

}
