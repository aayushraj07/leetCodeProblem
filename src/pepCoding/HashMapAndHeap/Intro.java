package src.pepCoding.HashMapAndHeap;

import java.util.HashMap;
import java.util.Set;

public class Intro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Pakistan", 40);
        hm.put("Utopia", 10);
        hm.put("china", 210);

        System.out.println(hm);
        System.out.println("//");
        System.out.println(hm.values());
        System.out.println("//");

        System.out.println(hm.get("India"));

        Set<String> keys = hm.keySet();

        for (String key : keys){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }
    }
}
