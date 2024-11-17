package src.leetcode;

public class RightMax {
    public static void main(String[] args) {
        int[] arr = {20, 10, 12, 15, 6, 9};
        int lnum = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > lnum) {
                lnum = arr[i];
            }
            arr[i] = lnum;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
