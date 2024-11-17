package src.leetcode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6};
//        System.out.println(nums.length);
//        System.out.println(missingNumber(nums));
        System.out.println(2^9);
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        boolean changed= false;
        for(int i =0; i< nums.length; i++){
            // 1,2,3,5,6
            if(i !=0){
                if(nums[i] != nums[i] +1);
                res = nums[i-1]+1;
                changed = true;
            }
        }
        if(!changed){
            res = nums[nums.length]+1;
        }
        return res;
    }
}
