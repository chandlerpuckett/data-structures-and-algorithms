package datastructures.graph;

public class App {
    public static void main(String[] args){
        Graph ourGraph = new Graph(4);

        //vertices
//        Vertex v0 = new Vertex("0");
//        Vertex v1 = new Vertex("1");
//        Vertex v2 = new Vertex("2");
//        Vertex v3 = new Vertex("3");

//        ourGraph.AddNode(v0);
//        ourGraph.AddNode(v1);
//        ourGraph.AddNode(v2);
//        ourGraph.AddNode(v3);

        //edges
        ourGraph.addEdge(0,1);
        ourGraph.addEdge(0,2);
        ourGraph.addEdge(1,2);
        ourGraph.addEdge(1,3);
        ourGraph.addEdge(2,0);
        ourGraph.addEdge(3,2);
        ourGraph.addEdge(3,3);

//        ourGraph.printGraph();
        System.out.println();

        // BFS traversal
        System.out.println(ourGraph.BFS(0));
    }
}
