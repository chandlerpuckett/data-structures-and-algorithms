package datastructures.graph;

import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private HashSet<Vertex> nodes;

    public Graph(){
        nodes = new HashSet<>();
    }

    public boolean AddEdge(Vertex v1, Vertex v2, int weight){
        return v1.getEdges().add(new Edge(v2, weight));
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
}

class Vertex{
    private String name;
    private LinkedList<Edge> edgeList;

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