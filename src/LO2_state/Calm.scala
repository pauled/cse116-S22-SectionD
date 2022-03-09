package LO2_state

class Calm (brain2:Student) extends State(brain2){
  override def study(): Unit = {
    println("I'm already calm")
  }

  override def getCloseToExam(): Unit = {
    brain2.mentalState=new Panic(brain2)
  }

  override def expressFeelings(): Unit = {
    println("I am a leaf on the wind")
  }
}
