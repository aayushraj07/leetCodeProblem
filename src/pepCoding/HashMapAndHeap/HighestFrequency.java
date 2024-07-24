package src.pepCoding.HashMapAndHeap;

import java.util.HashMap;

public class HighestFrequency {
    public static void main(String[] args) {
        String str  = "Aayush Raj";
        freq(str.toLowerCase());
    }

    private static void freq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< str.length(); i ++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                    int of = map.get(ch);
                    int nf = of+1;
                    map.put(ch,nf);
                }else{
                    map.putIfAbsent(ch,1);
                }
            }
        char max = str.charAt(0);
        for(Character key : map.keySet()){
            if(map.get(key) > map.get(max)){
                max = key;
            }
        }
        System.out.println(max +" "+ map.get(max));
    }
}
