package src.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,1,1));
        int[] numsArray = nums.stream().mapToInt(i -> i).toArray();
        sols(numsArray);
    }

    public static List<Integer> sols(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }



        int len = nums.length;
        for(int i = 0; i <= len; i++){
            if(!set.contains(i)){
                System.out.println(i);
                res.add(i);
            }
        }
        return res;
    }

}
