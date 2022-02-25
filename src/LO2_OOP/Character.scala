package LO2_OOP

class Character (){
  var battlesWon:Int=0
  var experiencePoints:Int=0

  def winBattle(xp:Int):Unit={
    this.battlesWon+=1
    this.experiencePoints+=xp
  }
}
