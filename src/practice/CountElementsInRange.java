package src.practice;

import java.util.Arrays;

public class CountElementsInRange {
    public static int countElementsInRange(int[] nums, int r1, int r2) {
        int count = 0;

        // Efficiently count elements within the range using binary search
        int leftIndex = Arrays.binarySearch(nums, r1);
        int rightIndex = Arrays.binarySearch(nums, r2);

        // Handle cases where the element is not found
        if (leftIndex < 0) {
            leftIndex = -leftIndex - 1;
        }
        if (rightIndex < 0) {
            rightIndex = -rightIndex - 1;
        }

        // Count elements within the range (inclusive)
        count = rightIndex - leftIndex;

        // Adjust count if r1 or r2 is present multiple times
        if (leftIndex < nums.length && nums[leftIndex] == r1) {
            count++;
        }
        if (rightIndex > 0 && nums[rightIndex - 1] == r2) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int r1 = 3;
        int r2 = 7;

        int count = countElementsInRange(nums, r1, r2);
        System.out.println("Number of elements in the range [" + r1 + ", " + r2 + "] is: " + count);
    }
}