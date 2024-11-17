package src.leetcode;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,4,4,5,6,7,7};
        System.out.println(removeDuplicates(arr));
    }
        public static int removeDuplicates(int[] nums) {

//            HashSet<Integer> set = new HashSet<>();
//            for(int i =0; i< nums.length; i++){
//                set.add(nums[i]);
//            }
//            int k=0;
//            for(int i =1; i<nums.length; i++){
//                if(set.contains(nums[i])){
//                    k++;
//                    nums[k] = nums[i];
//                }
//            }
//            return k;

            if(nums.length == 0){
                return 0;
            }
            int i =0;
            for(int j = 1; j< nums.length; j++){
                if(nums[j] != nums[i]) {
                    // Move the unique element to the next position
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
}
