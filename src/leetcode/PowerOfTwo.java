package src.leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 66;

        System.out.println(isPowerTwo(n));
    }

    private static boolean isPowerTwo(int n) {
        // Base cases:
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        }

        // Recursive case:
        if (n % 2 != 0) {
            return false;
        } else {
            return isPowerTwo(n / 2);
        }
    }
}
