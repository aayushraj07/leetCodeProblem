package src.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 4};
        System.out.println(twoSum(nums, 9));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }
}

//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer complementIndex = map.get(nums[i]);
//            if (complementIndex != null) {
//                return new int[]{i, complementIndex};
//            }
//            map.put(target - nums[i], i);
//        }
//
//        return nums;
//    }
//}

//    public int[] twoSum(int[] nums, int target){
//        for(int i = 1; i <= nums.length; i++){
//            if(nums[i] + nums[i-1] == target){
//                return new int[]{i, i-1};
//            }
//        }
//        return nums;
//    }
//}



