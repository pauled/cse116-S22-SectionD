package LO4_dataStructures

import LO2_OOP.GameObject

class BinarySearchTree [A](comparator:(A,A)=>Boolean){
  var root:BinaryTreeNode[A]=null
  def insert(a:A):Unit={
    if (this.root==null){
      this.root=new BinaryTreeNode[A](a,null,null)
    } else {
      insertHelper(a,this.root)
    }
  }
  def insertHelper(a:A,node:BinaryTreeNode[A]):Unit={
    if (comparator(a,node.value)){
      if (node.left==null){
        node.left=new BinaryTreeNode[A](a,null,null)
      } else {
        insertHelper(a,node.left)
      }
    } else {
      if (node.right==null){
        node.right=new BinaryTreeNode[A](a,null,null)
      } else {
        insertHelper(a,node.right)
      }
    }
  }
  def find(a:A):BinaryTreeNode[A]={
    findHelper(a,this.root)
  }
  def findHelper(a: A, node: BinaryTreeNode[A]):BinaryTreeNode[A]={
    if (node==null){
      null
    } else if(comparator(a,node.value)) {
      findHelper(a,node.left)
    } else if(comparator(node.value,a)) {
      findHelper(a,node.right)
    } else {
      node
    }
  }
}
object runBST{
  def sortString2(a:String,b:String):Boolean={
    if (a.length<b.length){
      true
    } else if(a.length==b.length && a<b){
      true
    } else {
      false
    }
  }
  def sortGameObjects(a:GameObject,b:GameObject):Boolean={
    val aDist=a.xLoc*a.xLoc+a.yLoc*a.yLoc
    val bDist=b.xLoc*b.xLoc+b.yLoc*b.xLoc
    if (aDist<bDist){
      true
    } else {
      false
    }
  }
  def main(args: Array[String]): Unit = {
    val intLessThan=(a:Int,b:Int)=>a<b
    val bst=new BinarySearchTree[Int](intLessThan)
    bst.insert(5)
    bst.insert(2)
    bst.insert(4)
    bst.insert(8)
    bst.insert(7)
    bst.insert(14)
    bst.insert(-3)
    println(bst.root.inOrderTraversal(bst.root))
    val node=bst.find(13)
    println(node)

    //hold string
    //sort based length then alphabetical order
    val sortString=(a:String,b:String)=> a<b
    val bst2=new BinarySearchTree[String](sortString2)
    bst2.insert("ac")
    bst2.insert("a")
    bst2.insert("c")
    bst2.insert("b")
    bst2.insert("aa")
    bst2.insert("bc")
    bst2.insert("acdc")
    bst2.insert("baaa")
    bst2.insert("z")
    bst2.insert("zztop")
    println(bst2.root.inOrderTraversal(bst2.root))

    val bst3=new BinarySearchTree[GameObject](sortGameObjects)
  }
}
