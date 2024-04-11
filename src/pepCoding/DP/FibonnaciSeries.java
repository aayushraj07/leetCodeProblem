package src.pepCoding.DP;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int n = 10;
        int[] qb = new int[n+1];
//        System.out.println(fibo(n));
        System.out.println(fiboDp(n,qb));
        
    }

    private static int fiboDp(int n , int[] qb) {
        if(n==0 || n ==1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        int fib1 = fiboDp(n-1,qb);
        int fib2 = fiboDp(n-2,qb);
        int fibn = fib2 + fib1;
        qb[n] = fibn;
        return fibn;
    }

    private static int fibo(int n) {
        if(n==0 || n ==1){
            return n;
        }
//        System.out.println("Fibonaci Series " + n );
        int fib1 = fibo(n-1);
        int fib2 = fibo(n-2);
        int fibn = fib2 + fib1;

        return fibn;

    }


}
