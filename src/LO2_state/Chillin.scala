package LO2_state

class Chillin (brain2:Student) extends State(brain2){
  override def study(): Unit = {
    println("I'm such a good student")
  }

  override def getCloseToExam(): Unit = {
    println("Who am I kidding, I passed")
  }

  override def expressFeelings(): Unit = {
    println("I am such a massive leaf on the wind")
  }
}
