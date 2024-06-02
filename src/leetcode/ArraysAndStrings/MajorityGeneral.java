package src.leetcode.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class MajorityGeneral {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,1,1,3,9,3};
        int k = 5;
        System.out.println(majorityGeneral1(arr,k));
    }

    private static ArrayList<Integer> majorityGeneral1(int[] arr, int k) {
        ArrayList<Integer> res =  new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i< arr.length){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
            i++;
        }
        for(int key : map.keySet()){
            if(map.get(key) > arr.length/k){
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}
