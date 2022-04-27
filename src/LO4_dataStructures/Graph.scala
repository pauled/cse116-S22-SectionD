package LO4_dataStructures

class Graph [A]{
  var nodes:Map[Int,A]=Map()
  var adjacencyList:Map[Int,List[Int]]=Map()
  def addNode(index:Int,a:A):Unit={
    nodes+=index->a
    adjacencyList+=index->List()
  }
  def addEdge(index1:Int,index2:Int):Unit={
    adjacencyList+=index1->(index2::adjacencyList(index1))
  }
}
object runGraph{
  def BFS[A](graph: Graph[A],startID:Int):Unit={
    val explored:Queue[Int]=new Queue()
    val toExplore:Queue[Int]=new Queue()
    toExplore.enqueue(startID)
    explored.enqueue(startID)
    while(!toExplore.empty()){
      val notToExplore=toExplore.dequeue()
      for (node <- graph.adjacencyList(notToExplore)){
        println("explored: "+explored)
        println("toExplore: "+toExplore)
        if (!explored.contains(node)){
          println("exploring:"+graph.nodes(node))
          toExplore.enqueue(node)
          explored.enqueue(node)
        }
      }
    }
  }
  def main(args: Array[String]): Unit = {
    var graph:Graph[String]=new Graph()
    graph.addNode(0,"DUL")
    graph.addNode(1,"OLA")
    graph.addNode(2,"MIL")
    graph.addNode(3,"SFA")

    graph.addEdge(0,1)
    graph.addEdge(0,2)
    graph.addEdge(0,3)
    graph.addEdge(1,2)
    graph.addEdge(1,3)
    graph.addEdge(2,0)
    graph.addEdge(2,1)
    graph.addEdge(2,3)
    graph.addEdge(3,2)
    graph.addEdge(3,1)
    BFS(graph,0)
  }
}
