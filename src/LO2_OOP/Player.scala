package LO2_OOP

class Player (var xLoc1:Double,var yLoc1:Double,
              var maxHitPoint:Int)
      extends GameObject (xLoc1,yLoc1){
  var health:Int=maxHitPoint
  var damage:Int=4

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
