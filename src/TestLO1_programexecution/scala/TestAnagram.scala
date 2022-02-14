package TestLO1_programexecution.scala

import org.scalatest.FunSuite
import LO1_program_execution.scala._

class TestAnagram extends FunSuite{
  test("testing is anagram"){
    var testCases:Map[List[String],Boolean]=Map(
      List("hello","HellO")->true,
      List("heLLo","h eL Lo")->true,
      List("Helo","Hello")->false,
      List("hell o","helo")->false,
      List("hel99!","hel")->true,
      List("pool99","pol99")->false,
      List("hello","olleh")->true,
      List("helLo","lolhe")->true,
      List("ppoo","op")->false,
      List("ppoo","o p ")->false,
      List("this","")->false
    )

    //check spaces and non-letters
    //basic anagram test true and false
    //check capitalization
    //check for multiples
    //check for empty strings
    for ((values,expected)<-testCases){
      assert(Anagram.isAnagram(values(0),values(1))==expected,"inputs: "+values(0)+
      " "+values(1)+" expected:"+expected)
    }
    for ((values,expected)<-testCases){
      assert(Anagram.isAnagram(values(1),values(0))==expected,"inputs: "+values(1)+
        " "+values(0)+" expected:"+expected)
    }
  }
}
