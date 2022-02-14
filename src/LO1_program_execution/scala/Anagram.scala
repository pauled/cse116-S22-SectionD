package LO1_program_execution.scala

object Anagram {
  def isAnagram(str1:String,str2:String):Boolean={
    var cleanStr1:List[String]=List()
    var cleanStr2:List[String]=List()
    for (letter <- str1.toLowerCase){
      if (letter.isLetter) {
        cleanStr1 = cleanStr1 :+ letter.toString
      }
    }
    for (letter <- str2.toLowerCase){
      if (letter.isLetter) {
        cleanStr2 = cleanStr2 :+ letter.toString
      }
    }
    cleanStr1.sorted == cleanStr2.sorted
  }
}
