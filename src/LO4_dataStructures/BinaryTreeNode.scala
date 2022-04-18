package LO4_dataStructures

class BinaryTreeNode[B](var value:B,
                        var left:BinaryTreeNode[B],
                        var right:BinaryTreeNode[B]) {
  def preOrderTraversal[B](node:BinaryTreeNode[B]):String={
    var out:String=""
    if (node!=null) {
      //top
      out += node.value+" "
      //left
      out += preOrderTraversal(node.left)
      //right
      out += preOrderTraversal(node.right)
    }
    out
  }
  def inOrderTraversal[B](node:BinaryTreeNode[B]):String={
    //left
    //right
    //top
    var out:String=""
    if (node!=null) {
      //left
      out += inOrderTraversal(node.left)
      //right
      out += inOrderTraversal(node.right)
      //top
      out += node.value+" "
    }
    out
  }
  def postOrderTraversal[B](node:BinaryTreeNode[B]):String={
    //left
    //top
    //right
    var out:String=""
    if (node!=null) {
      //left
      out += postOrderTraversal(node.left)
      //top
      out += node.value+" "
      //right
      out += postOrderTraversal(node.right)

    }
    out
  }
}
object runBTN{
  def main(args: Array[String]): Unit = {
    var root=new BinaryTreeNode[Int](5,null,null)
    root.left=new BinaryTreeNode[Int](2,null,null)
    root.right=new BinaryTreeNode[Int](8,null,null)
    root.left.left=new BinaryTreeNode[Int](-1,null,null)
    root.left.right=new BinaryTreeNode[Int](3,null,null)
    root.right.left=new BinaryTreeNode[Int](6,null,null)
    root.right.right=new BinaryTreeNode[Int](9,null,null)

    println(root.preOrderTraversal(root))
    println(root.inOrderTraversal(root))
    println(root.postOrderTraversal(root))
  }
}