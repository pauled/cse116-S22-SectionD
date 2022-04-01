package LO3_functionalProgramming

object simpleRecursion {
  def computeGeometricSum(n:Int):Int={
    if (n<1){
      0
    } else {
      //n+computeGeometricSum(n-1)
      var result=computeGeometricSum(n-1)
      result+=n
      result
    }
  }
  def add(a:Int,b:Int):Int={
    if (b==0){
      a
    } else if (b<0) {
      add(a-1,b+1)
    }else {
      add(a+1,b-1)
    }
  }
  def subtract(a:Int,b:Int):Int={
    if (b==0){
      a
    } else if (b<0) {
      subtract(a+1,b+1)
    }else {
      subtract(a-1,b-1)
    }
  }
  def fib(n:Int):Int={
    if (n==1){
      0
    } else if(n==2){
      1
    } else {
      fib(n-1)+fib(n-2)
    }
  }
  def acronymTrail(strings: Array[String],
                   loc:Int):String={
    if (loc==strings.length){
      ""
    } else {
      //strings(loc).slice(0,1)+acronymTrail(strings,loc+1)
      var out:String=acronymTrail(strings,loc+1)
      out=strings(loc).slice(0,1)+out
      out
    }
  }
  def acronymTail(strings: Array[String],
                   loc:Int,acc:String):String={
    if (loc==strings.length){
      acc
    } else {
      acronymTail(strings,loc+1,
        acc+strings(loc).slice(0,1))
    }
  }
  def acronymTailHelper(strings:Array[String]):String={
    acronymTail(strings,0,"")
  }
  def acronym(strings: Array[String]):String={
    acronymTrail(strings,0)
  }
  def recursiveReverse(value: String):String={
    if (value.length==0){
      ""
    } else {
      recursiveReverse(value.slice(1,value.length))+
        value.slice(0,1)
    }
  }

  def main(args: Array[String]): Unit = {
    var out=computeGeometricSum(4)
    println(out)
    var words:Array[String]=Array("Fricked","Up",
      "Beyond","All","Recognition")
    var ac=acronym(words)
    println(ac)
    val ac2=acronymTailHelper(words)
    println(ac2)
    val rev:String=recursiveReverse("fun")
    println(rev+" said")
  }
}
