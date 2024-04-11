package src.pepCoding.Recursion;

public class PowerRecursion {
    public static void main(String[] args) {
        int p = power(5,3);
        System.out.println(p);
    }

//    TC -> O(n)

    private static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;

    }
}
