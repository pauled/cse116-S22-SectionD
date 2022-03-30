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

  def main(args: Array[String]): Unit = {
    var out=computeGeometricSum(4)
    println(out)
  }
}
