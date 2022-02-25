package LO2_OOP

class Party (){
  var members:List[Character]=List()
  var battlesWon:Int=0

  def addCharacter(member:Character):Unit={
    this.members=this.members:+member
  }

  def winBattle(xp:Int):Unit={
    this.battlesWon+=1
    for (member<-this.members){
      member.winBattle(xp)
    }
  }
}


