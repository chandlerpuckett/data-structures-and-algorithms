package datastructures.graph;

public class App {
    public static void main(String[] args){
        Graph ourGraph = new Graph(4);

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
