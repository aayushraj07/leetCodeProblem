package src.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> maps = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(maps.contains(nums[i])) return true;
            maps.add(nums[i]);
        }
        return false;


//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        ArrayList<Integer> map2 = new ArrayList();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                return true;
//            } else {
//                map.put(nums[i], 1);
//                map2.add(nums[i]);
//            }
//        }
//        System.out.println(map);
//        System.out.println(map2);
//        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // should print true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // should print false
    }
}


