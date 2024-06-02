package src.leetcode.ArraysAndStrings;

import java.sql.Array;

public class SquareOfSorted {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        displayArr(arr);
        int[] res = findSorte(arr);
        displayArr(res);
    }
    private static void displayArr(int[] res) {
        for (int i = 0; i< res.length; i++){
            System.out.print(res[i] + " " );
        }
        System.out.println();
    }

    private static int[] findSorte(int[] arr) {
        int[] res = new int[arr.length];

        int i = 0;
        int j = arr.length-1;
        int count = arr.length-1;
        while (i <= j) {
            if((arr[i] * arr[i]) < (arr[j] * arr[j])){
                res[count] = arr[j] * arr[j];
                j--;
            }else{
                res[count] =arr[i] * arr[i];
                i++;
            }
            count--;
        }
        return res;
    }
}
