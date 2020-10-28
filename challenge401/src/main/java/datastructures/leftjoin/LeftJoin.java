package datastructures.leftjoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {
    public static List<String> leftJoin (HashMap map1, HashMap map2){

        List<String> ansList = new ArrayList<>();
        for (Object key : map1.keySet()){
            if (map1.containsKey(key)){
                ansList.add(key + ": " + map1.get(key) + ", " + map2.get(key));
            } else {
                ansList.add(key + ": " + map1.get(key) + ", " + null);
            }
        }

        return ansList;
    }
}
