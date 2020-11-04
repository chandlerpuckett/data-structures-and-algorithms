package datastructures.depthfirst;


import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirst {
//    https://www.baeldung.com/java-depth-first-search

    // -------- NOT WORKING YET
//    public static LinkedList<Node> depthFirstSearch(Node start) {
//        LinkedList result = new LinkedList();
//        HashSet<Node> visited = new HashSet<>();
//
//        Stack stack = new Stack();
//        stack.push(start);
//        visited.add(start);
//
//        while (!stack.isEmpty()) {
//            Node tempNode = (Node) stack.pop();
//            result.add(tempNode);
//
//            for (Edge neighbor : (HashSet<Edge>) tempNode.neighbors) {
//                if (!visited.contains(neighbor.node)) {
//                    stack.push(neighbor.node);
//                    visited.add(neighbor.node);
//                }
//            }
//        }
//        return result;
//    }
}
