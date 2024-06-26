package src.pepCoding.Arrays;

import java.util.Arrays;

public class ThreeSum {

//    Two pointer takes O(n)
//    and for loop is taking O(n)
//    Time complexity O(n^2)
//    Space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {7, -6, 3, 8, -1, 8, -1};
        int target = 0;
        solution(arr, target, arr.length);
    }
    private static void solution(int[] a, int target, int n) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (i == 0 || (a[i] != a[i - 1])) {
                int j = i + 1, k = n - 1;
                int tar = target - a[i];
                while (j < k) {
                    if (a[j] + a[k] == tar) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
//                        ignoring duplicates
                        while (j < k && a[j] == a[j + 1]) j++;
                        while (j < k && a[k] == a[k - 1]) k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
    }
}
