package LO2_OOP

class Transporter (xLoc2:Double,yLoc2:Double,var dx:Double,
                   var dy:Double)
      extends GameItem (xLoc2,yLoc2){
  override def use(player: Player): Unit = {
    player.xLoc+=this.dx
    player.yLoc+=this.dy
  }

  override def toString: String = {
    var out:String="transporter: "+super.toString
    out+=" xd: "+this.dx+" dy: "+this.dy
    out
  }
}
