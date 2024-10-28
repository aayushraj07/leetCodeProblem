package src.basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,5,2,42};

        String[] strings = {"Aayush", "Raj", "Honey", "Indian"};

        HashMap<Integer, String> map = new HashMap<>();

        int stringIndex = 0;
        for(int i = 0; i< arr.length; i++){
            if(stringIndex < strings.length){
                map.put(arr[i], strings[stringIndex]);
                stringIndex++;
            }else{
                map.put(arr[i], null);
            }
        }

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
