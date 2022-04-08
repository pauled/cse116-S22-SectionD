package LO3_functionalProgramming

object ILoveREcursion {
//get the total of an array of Ints
  def totalValue(ints: Array[Int]):Int={
    totalValueRecursion(ints,0)
  }
  def totalValueRecursion(ints: Array[Int],
                          loc:Int):Int={
    if (loc==ints.length){
      0
    } else {
      totalValueRecursion(ints,loc+1)+ints(loc)
    }
  }
  def totalValueT(ints: Array[Int]):Int={
    totalValueRecursionT(ints,0,0)
  }
  def totalValueRecursionT(ints: Array[Int],
                          loc:Int,total:Int):Int={
    if (loc==ints.length){
      total
    } else {
      totalValueRecursionT(ints,loc+1,total+ints(loc))
    }
  }
  //get the average of an array of Ints
  def averageValue(ints: Array[Int]):Double={
    totalValue(ints).toDouble/ints.length.toDouble
  }
  def averageValueT(ints: Array[Int]):Double={
    averageValueRecursionT(ints,0,0)
  }
  def averageValueRecursionT(ints: Array[Int],
                           loc:Int,total:Int):Double={
    if (loc==ints.length){
      total.toDouble/ints.length.toDouble
    } else {
      averageValueRecursionT(ints,loc+1,total+ints(loc))
    }
  }
  //search an array of Ints for a value returning a Bool
  def search(ints: Array[Int], value:Int):Boolean={
    searchRecursion(ints,value,0)
  }
  def searchRecursion(ints: Array[Int], value: Int,
                      loc:Int):Boolean={
    if (ints.length==loc){
      false
    } else if (ints(loc)==value){
      true
    } else {
      searchRecursion(ints, value, loc+1)
    }
  }
  def main(args: Array[String]): Unit = {
    val nums:Array[Int]=Array(1,2,3,4,5)
    var temp=totalValue(nums)
    println(temp)
    var temp2=averageValue(nums)
    println(temp2)
    println(search(nums,10))
  }
}
