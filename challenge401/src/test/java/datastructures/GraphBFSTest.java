package datastructures;

import datastructures.graph.Graph;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class GraphBFSTest {
    @Test
    public void testBfs(){
        Graph graph = new Graph(4); // create 4 vertices
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,0);
        graph.addEdge(3,2);
        graph.addEdge(3,3);
        
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, graph.BFS(0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void emptyBFS(){
        Graph graph = new Graph(0);
        graph.BFS(0);
    }


}
