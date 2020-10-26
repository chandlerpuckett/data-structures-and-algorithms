package datastructures.repeatedword;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    public String findDuplicate (String str){

        if (str == null || str.isEmpty()){
            return null;
        }

        String duplicate = null;
        String lower;

        lower = str.toLowerCase();
        String[] words = lower.split("\\s+");
        Set<String> set = new HashSet<>();

        for (String word : words){
            if (!set.add(word)){
                duplicate = word;
                break;
            }
        }

        return duplicate;
    }
}
