package src.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        int a = 4213;
        int b = reverse(a);
        System.out.println(a + " -> " +b);
    }

    private static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            int temp = result * 10 + digit;
            if ((temp - digit) / 10 != result) {
                return 0;
            }
            result = temp;
            x /= 10;
        }
        return result;


    }
}
