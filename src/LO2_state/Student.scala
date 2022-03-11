package LO2_state

class Student {
  var mentalState:State=new Calm(this)
  var name:String="aName"

  def study():Unit={
    this.mentalState.study()
  }
  def getCloseToExam():Unit={
    this.mentalState.getCloseToExam()
  }
  def expressFeelings():Unit={
    this.mentalState.expressFeelings()
  }
  def passClass():Unit={
    this.mentalState=new Chillin(this)
  }
  def enrollInClass():Unit={
    this.mentalState=new Calm(this)
  }
  def skipHomework():Unit={
    this.mentalState=new ExistentialDread(this)
  }
}
