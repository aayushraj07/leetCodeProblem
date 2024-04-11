package src.pepCoding.Arrays;

import java.util.Scanner;

public class SmallestNumber {

//    Time complexity O(log2n)
//    Space complexity O(1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(smallestNum(n));
    }

    private static int smallestNum(int n) {
        String ans = "";
        for(int div = 9; div >= 2; div--){
            while(n%div == 0){
                n = n/div;
                ans = div + ans;
            }
        }
        if(n != 1){
            return -1;
        }else{
            return Integer.parseInt(ans);
        }
    }
}
