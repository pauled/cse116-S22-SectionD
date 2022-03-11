package LO2_state

class Panic (brain2:Student) extends State(brain2){
  override def study(): Unit = {
    //println("I'm already calm")
    brain2.mentalState=new Calm(brain2)
    brain2.name="whatever"
  }

  override def getCloseToExam(): Unit = {
    //brain2.mentalState=new Panic(brain2)
    println("I'm starting to panic!")
  }

  override def expressFeelings(): Unit = {
    println("I'm freaking out man!")
  }
}
