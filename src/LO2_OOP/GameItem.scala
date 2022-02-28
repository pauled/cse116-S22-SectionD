package LO2_OOP

abstract class GameItem (var xLoc:Double,var yLoc:Double){
  def use(player: Player): Unit

  def move(dx:Double,dy:Double):Unit={
    this.xLoc+=dx
    this.yLoc+=dy
  }
}
