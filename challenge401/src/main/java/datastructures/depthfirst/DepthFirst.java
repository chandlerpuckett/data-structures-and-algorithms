package datastructures.depthfirst;

import datastructures.graph.Graph;
import datastructures.stacksandqueues.Stack;
import org.apache.commons.math3.geometry.spherical.twod.Vertex;

import java.util.LinkedHashSet;
import java.util.Set;

public class DepthFirst {
//    https://www.baeldung.com/java-depth-first-search

    // -------- NOT WORKING YET

//    public Set<String> depthFirst (Graph g1, String root){
//        Set<String> visited = new LinkedHashSet<String>();
//        Stack<String> stack = new Stack<String>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            String vertex = stack.pop();
//            if (!visited.contains(vertex)) {
//                visited.add(vertex);
//                for (Vertex v : g1.getAdjVertices(vertex)) {
//                    stack.push(v.label);
//                }
//            }
//        }
//        return visited;
//    }

}
