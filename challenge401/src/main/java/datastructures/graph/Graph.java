package datastructures.graph;

import org.checkerframework.checker.units.qual.K;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int V; // no. of vertices
    public List<Integer> adj[]; // list of adjacent edges
    private HashSet<Vertex> nodes;

    public Graph(int v){
        V = v;
        adj = new LinkedList[v];

        for (int i=0; i < v; i++){
            adj[i] = new LinkedList<>();
        }

    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public boolean AddNode(Vertex v){
        return nodes.add(v);
    }

    public void printGraph(){
        for(Vertex v : nodes){
            System.out.print("vertex name: "+ v.getName() + ": ");
            for(Edge e : v.getEdges()){
                System.out.print("destVertex: " + e.getDestVertex().getName() + " weight: " + e.getWeight() + " | ");
            }
            System.out.print("\n");
        }
    }

//    ---------- GET EDGES NOT WORKING YET -------------

//    public void getEdges(Graph g1, String[] cityList){
//        int acc = 0;
//        int i = 0;
//
//        while (cityList[i+1]){
//            if (cityList[i+1] ){
//                acc += g1[cityList[i]][i+1]
//            }
//        }
//    }


    public LinkedList<Integer> BFS (int s){
        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> solution = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0){
            s = queue.poll();
            solution.add(s);

            for (int n : adj[s]) {

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        return solution;
    }
}

class Vertex{
    private String name;
    public LinkedList<Edge> edgeList;

    public Vertex(String name){
        this.name = name;
        edgeList = new LinkedList<>();
    }

    public String getName(){
        return name;
    }

    public LinkedList<Edge> getEdges(){
        return edgeList;
    }
}

class Edge{
    private int weight;
    private Vertex destVertex;

    public Edge(Vertex dest, int w){
        this.destVertex = dest;
        this.weight = w;
    }

    public Edge(Vertex dest){
        this.destVertex = dest;
        this.weight = 1;
    }

    public int getWeight(){
        return weight;
    }

    public Vertex getDestVertex(){
        return destVertex;
    }
}