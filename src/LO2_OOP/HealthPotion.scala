package LO2_OOP

class HealthPotion (xLoc:Double,yLoc:Double,var increase:Int)
      extends GameItem (xLoc,yLoc){

  override def use(player: Player): Unit = {
    player.health+=this.increase
  }
  def multiplyEffect(factor:Int):Unit={
    this.increase*=factor
  }
}
