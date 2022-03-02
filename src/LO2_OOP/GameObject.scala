package LO2_OOP

class GameObject (var xLoc:Double,var yLoc:Double){
  def move(dx:Double,dy:Double):Unit={
    this.xLoc+=dx
    this.yLoc+=dy
  }

  override def toString: String = {
    var out:String=super.toString
    out+=" xLocation: "+this.xLoc
    out+=" yLocation: "+this.yLoc
    out
  }
}
