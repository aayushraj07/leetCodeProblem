package src.pepCoding.Arrays;

import static mix.Sorting.printArray;

public class Rotate {
    public static void main(String[] args) {
        int k = 2;
        int[] arr ={1,2,3,4,5,6};

        rotate(arr,k);
        printArray(arr);
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if(k<0){
            k = k + arr.length;
        }
//        reverse part 1
        reverse(arr,0, arr.length-k-1);

//        reverse part 2
        reverse(arr,arr.length-k, arr.length-1);

//        reverse all
        reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        int li = i;
        int ri = j;

        while(li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;

        }

    }


}
