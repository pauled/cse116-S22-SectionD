package LO2_state

object runStudent {
  def main(args: Array[String]): Unit = {
    var bob:Student=new Student()
    bob.study()
    bob.getCloseToExam()
  }
}
