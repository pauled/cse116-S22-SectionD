package LO2_state

class Student {
  var mentalState:State=new Calm(this)

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
}
