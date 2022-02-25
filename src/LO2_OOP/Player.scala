package LO2_OOP

class Player (var xLoc:Double,var yLoc:Double,
              var maxHitPoint:Int){
  var health:Int=maxHitPoint
  var damage:Int=4

  def takeDamage(damage:Int):Unit={
    this.health-=damage
  }
  def attack(otherPlayer:Player):Unit={
    otherPlayer.takeDamage(this.damage)
  }
  def move(dx:Double,dy:Double):Unit={
    this.xLoc+=dx
    this.yLoc+=dy
  }
  /*override def toString():String={
    var out:String="xLocation: "+this.xLoc
    out+=" yLocation: "+this.yLoc
    out+="health "+this.health+"/"+this.maxHitPoint
    out
  }*/

}
