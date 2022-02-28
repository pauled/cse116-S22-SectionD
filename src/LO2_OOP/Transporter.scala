package LO2_OOP

class Transporter (xLoc:Double,yLoc:Double,var dx:Double,
                   var dy:Double) extends GameItem (xLoc,yLoc){
  override def use(player: Player): Unit = {
    player.xLoc+=this.dx
    player.yLoc+=this.dy
  }
}
