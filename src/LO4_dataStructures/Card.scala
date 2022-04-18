package LO4_dataStructures

class Card (suit:String,number:Int){
  override def toString: String = {
    if (this.number==13){
      "King of "+this.suit
    } else if (this.number==12){
      "Queen of "+this.suit
    } else if (this.number==11){
      "Jack of "+this.suit
    } else if (this.number==1){
      "Ace of "+this.suit
    } else {
      this.number+" of "+this.suit
    }
  }
}
