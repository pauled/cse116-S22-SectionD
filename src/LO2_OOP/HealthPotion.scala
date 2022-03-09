package LO2_OOP

class HealthPotion (xLoc:Double,yLoc:Double,var increase:Int)
      extends GameItem (xLoc,yLoc){

  override def use(player: Player): Unit = {
    player.health+=this.increase
  }
  def multiplyEffect(factor:Int):Unit={
    this.increase*=factor
  }
  override def equals(obj: Any): Boolean = {
    obj match{
      case hp:HealthPotion => this.increase==hp.increase
      case _=>false
    }
  }
}
