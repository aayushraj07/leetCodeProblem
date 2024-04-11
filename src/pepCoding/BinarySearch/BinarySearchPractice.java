package src.pepCoding.BinarySearch;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,2,3,4,5,6,7,8,9};
        int target = 9;
        binarySearchAlgo(arr, target);


    }

    private static void binarySearchAlgo(int[] arr, int target) {
        int low= 0;
        int high = arr.length-1;
        Arrays.sort(arr);

        while(low <= high){
            int mid = (low+high)/2;
                    if(arr[mid] > target){
                        high = mid -1;
                    }else if(arr[mid] < target){
                        low = mid+1;
                    }else{
                        System.out.println(target + " is at " + mid + " position!");
                        return;
                    }
        }

        System.out.println(-1);
    }
}
