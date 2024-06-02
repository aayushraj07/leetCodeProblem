package src.leetcode.ArraysAndStrings;

import java.util.ArrayList;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,1,1,3,9,3};
        ArrayList<Integer> candidate = validCandidate2(arr);
        System.out.println(candidate);
    }

    private static ArrayList<Integer> validCandidate2(int[] arr) {

        int val1 = arr[0];
        int count = 1;

        int val2 = arr[0];
        int count2 = 0;

        int i = 1;
        while(i< arr.length){
            if(arr[i] == val1){
                count++;
            }
            if(arr[i] == val2){
                count2++;
            }else{
                if(count == 0){
                    val1 = arr[i];
                    count = 1;
                } else if (count2 == 0){
                    val2 = arr[i];
                    count = 1;
                } else {
                    count--;
                    count2--;
                }
            }
            i++;
        }

        ArrayList<Integer> res = new ArrayList<>();
        if(isGreaterThannBy3(arr, val1))
            res.add(val1);
        if(val1 != val2 && isGreaterThannBy3(arr, val2))
            res.add(val2);

    return res;
    }

    private static boolean isGreaterThannBy3(int[] arr, int val) {
        int count = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i] == val){
                count++;
            }
        }
        if(count > (arr.length/3)){
            return true;
        }else {
            return false;
        }
    }
}
