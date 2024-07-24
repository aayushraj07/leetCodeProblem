package src.pepCoding.HashMapAndHeap;

import java.util.HashMap;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int val : nums){
            map.put(val, true);
        }

        for(int val: nums){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        int msp = 0;
        int ml = 0;
        for(int val : nums){
            if(map.get(val) == true){
                int tl = 1;
                int tsp = val;

                while(map.containsKey(tsp+tl)){
                    tl++;
                }

                if(tl > ml){
                    ml = tl;
                }
            }
        }
        return ml;
    }
}
