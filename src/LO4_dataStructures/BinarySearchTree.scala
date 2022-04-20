package LO4_dataStructures

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
  def main(args: Array[String]): Unit = {
    val intLessThan=(a:Int,b:Int)=>a<b
    val bst=new BinarySearchTree[Int](intLessThan)
    bst.insert(5)
    bst.insert(2)
    bst.insert(8)
    bst.insert(4)
    bst.insert(7)
    bst.insert(14)
    bst.insert(-3)
    println(bst.root.postOrderTraversal(bst.root))
    val node=bst.find(13)
    println(node)
  }
}
