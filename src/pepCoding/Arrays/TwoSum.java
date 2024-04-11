package src.pepCoding.Arrays;

import java.util.HashMap;

public class TwoSum {

//    Time complexity O(n)
//    Space complexity O(n)

    public static void main(String[] args) {
        int[] arr = {11,3,7,9,14,2};
        int target =17;
        System.out.println(twoSum(arr,target));
    }

    private static HashMap<Integer,Integer> twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map= new HashMap<>();
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i= 0; i<arr.length; i++){
            int j = target- arr[i];
            if(map.containsKey(j)){
                result.put(map.get(j),i);
                return result;
            }else{
                map.put(arr[i],i);
            }
        }
        return result;
    }
}
