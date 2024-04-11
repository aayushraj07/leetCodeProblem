package src.leetcode;

public class IntegerReplacement {
    public static void main(String[] args) {
        System.out.println(integerReplacement(65535));
        System.out.println();
    }
//    public static long integerReplacement(int n) {
//        long moves = 0;
//        if (n==1){
//            return 0;
//        }
//        while(n!=1){
//            if(n%2 ==0){
//                n = n/2;
//                moves++;
//            }else{
//                n = n-1;
//                moves++;
//            }
//        }
//        return moves;
//    }


    public static int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return integerReplacement(n / 2) + 1;
        } else {
            int x = integerReplacement(n - 1);
            int y = integerReplacement(n + 1);
            return Math.min(x, y) + 1;
        }
    }
}
