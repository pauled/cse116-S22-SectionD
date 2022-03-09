package LO2_OOP

class Player (var xLoc1:Double,var yLoc1:Double,
              var maxHitPoint:Int)
      extends GameObject (xLoc1,yLoc1){
  var health:Int=maxHitPoint
  var damage:Int=4
  var inventory:Array[GameItem]=new Array[GameItem](5)
  var invSize:Int=0

  def pickUpItem(gameItem: GameItem):Unit={
    if (this.invSize<this.inventory.length) {
      this.inventory(invSize) = gameItem
      this.invSize += 1
    }
  }
  def useItem(itemLoc:Int):Unit={
    this.inventory(itemLoc).use(this)
  }
  def takeDamage(damage:Int):Unit={
    this.health-=damage
  }
  def attack(otherPlayer:Player):Unit={
    otherPlayer.takeDamage(this.damage)
  }

  override def toString():String={
    var out:String=super.toString
    out+=" health "+this.health+"/"+this.maxHitPoint
    out
  }



}
