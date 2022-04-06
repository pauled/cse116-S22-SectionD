package LO3_functionalProgramming

object Anagram {
  def anagrams(input:String):List[String]={
    println("\nstart anagram("+input+")")
    if (input.length==1){
      List(input)
    } else {
      val output:List[List[String]]=
        (for (i<-0 until input.length) yield {
          val newString:String=input.substring(0,i)+
            input.substring(i+1,input.length)
          println("newString: "+newString+ " char(i)"+
          input.charAt(i))
          anagrams(newString).map(_+input.charAt(i))
        }).toList
      println(output)
      println(output.flatten.distinct)
      println("finish anagram("+input+")")
      output.flatten.distinct
    }
  }

  def main(args: Array[String]): Unit = {
    val ana=anagrams("12345")
    println(ana)
  }
}
