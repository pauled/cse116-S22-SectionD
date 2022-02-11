package TestLO1_programexecution.scala

import org.scalatest.FunSuite
import LO1_program_execution.scala._

class TestConditional extends FunSuite{
  test("test conditional file computeSize method"){
    val large:List[Double]=List(70.0,60.0,60.01,90.0,1000.0)
    val medium:List[Double]=List(50.0,59.99,40.0,30.0,30.01)
    val small:List[Double]=List(-1100,-1.0,0.0,20,29.99)
    val allTests:Map[Double,String]=Map(
      70.0->"large",
      40.0->"medium",
      29.99->"small")
    for ((key,value)<-allTests){
      assert(Conditional.computeSize(key)==value,"Expected: "+value+" got: "+
        Conditional.computeSize(key)+" input: "+key)
    }
    for (largeValues <- large) {
      assert(Conditional.computeSize(largeValues) == "large", largeValues)
    }
    for (mediumValues <- medium) {
      assert(Conditional.computeSize(mediumValues) == "medium", mediumValues)
    }
    for (smallValue <- small) {
      assert(Conditional.computeSize(smallValue) == "small", smallValue)
    }
  }
}
