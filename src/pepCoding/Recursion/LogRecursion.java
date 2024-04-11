package src.pepCoding.Recursion;

import java.util.Scanner;

public class LogRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: -> ");
        int x = sc.nextInt();
        System.out.print("n: -> ");
        int n = sc.nextInt();
        int xn = power(x,n);
        System.out.println(xn);
    }

//    TC -> O(Logn)

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        int xpnb2 = power(x, n/2);
        int xn = xpnb2 * xpnb2;

        if(n % 2 == 1){
            xn = xn*x;
        }
        return xn;
    }
}
