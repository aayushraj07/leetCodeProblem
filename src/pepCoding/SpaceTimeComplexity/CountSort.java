package src.pepCoding.SpaceTimeComplexity;

import static src.pepCoding.SpaceTimeComplexity.BubbleSort.print;

public class CountSort {
    public static void main(String[] args) {
        int arr[] = {9,6,3,5,3,4,3,9,6,4,5,6,8,9,9};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        print(arr);
        System.out.println();
        countSort(arr, min, max);
        print(arr);
        System.out.println();
    }

    private static void countSort(int[] arr, int min, int max) {
        int range = max -min+1;
        int[] freq = new int[range];


        for (int i = 0; i < arr.length; i++){
            int idx = arr[i] - min;
            freq[idx]++;
        }

        for (int i = 1; i< freq.length; i++){
            freq[i] = freq[i] + freq[i-1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--){
            int val = arr[i];
            int pos = freq[val - min];
            int idx = pos -1;
            ans[idx] = val;
            freq[val-min]--;
        }

        for (int i =0; i< arr.length; i++){
            arr[i] = ans[i];
        }


    }
}
