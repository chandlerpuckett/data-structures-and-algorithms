package datastructures.treeintersection;
import datastructures.tree.*;
import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {
    public ArrayList<Integer> treeIntersection (BinaryTree t1, BinaryTree t2){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> set1 = t1.inOrder(t1.root);
        ArrayList<Integer> set2 = t2.inOrder(t2.root);

        ArrayList<Integer> intersections = new ArrayList<>();
        for (int num : set1)
            hashMap.put(num, num);

        for (int val : set2){
            if (hashMap.containsKey(val)){
                intersections.add(val);
            }
        }

        return intersections;
    }
}


