package src.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class PermutationNext {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        fn2(nums);
    }

    private static void fn2(int[] nums) {
        int last = nums[nums.length - 1];
        boolean outerLoop = true;
        int i = nums.length - 2;
        int index = 0;
        while (i > 0 && outerLoop) {
            if (last > nums[i]) {
                index = i;
                int j = nums.length - 1;
                while (j > i && outerLoop) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    outerLoop = false;
                }
            }
            i--;
        }
        int start = index;
        int end = nums.length-1;
//          3 2 1
//        start 0
//        end 2
//    temp = 3;

//    nums[start] =
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end - 1];
            nums[end - 1] = temp;
            start++;
            end--;
        }

        for(int it : nums){
            System.out.print(it + " ");
        }

    }
}
