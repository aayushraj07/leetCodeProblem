package src.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0,0,0};
        int m = 0;
        int[] nums2 = {1,2,3};
        int n = 3;
        int i =0;
        int j =0;
        int p1 = m+n-1;
        while(i <= p1){
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                j++;
                if(j>=n){
                    break;
                }
            }
            if(nums1[i] < nums2[j]){
                i++;
            }
            if(nums1[i] > nums2[j]){
                nums1[i] = nums1[i]+ nums2[j];
                nums2[j] = nums1[i]-nums2[j];
                nums1[i] = nums1[i]-nums2[j];
                i++;
            }
            if(nums1[i] == nums2[j]){
                i++;
            }
        }
        Arrays.sort(nums1);
        for(int intI : nums1){
            System.out.print(intI + " ");
        }
        System.out.println();
    }
}
