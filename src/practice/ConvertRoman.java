package src.practice;






//for (int i = 0; i < n.length(); i++) {
//        int currentValue = map.get(String.valueOf(n.charAt(i)));
//        if (currentValue > prevValue) {
//        val -= prevValue;
//        } else {
//        val += prevValue;
//        }
//        prevValue = currentValue;
//        }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ConvertRoman {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        convertR(n);
    }

    private static Integer convertR(String n) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L",50);
        map.put("X", 10);
        map.put("V",5);
        map.put("I",1);
        int val = 0;
        int prevVal = 0;
        for (int i =0; i<n.length();i++){
            if(map.containsKey(String.valueOf(n.charAt(i)))){
                int currentValue = map.get(n.charAt(i));
                if (currentValue > prevVal) {
                    val -= prevVal;
                } else {
                    val += prevVal;
                }

                prevVal = currentValue;
            }

            val += prevVal;
            return val;
        }
        System.out.println(val);
        return val;

    }
}
