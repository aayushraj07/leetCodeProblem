package src.leetcode;

class fibonacci {

    private static long[] fibbonacciCache;
    static long fib(int n)
    {
        if (n <= 1)
            return n;

        long nthNum =  fib(n - 1) + fib(n - 2);
        fibbonacciCache[n] = nthNum;
        return nthNum;
    }


    public static void main(String args[])
    {

        int n = 9;
        fibbonacciCache = new long[n+1];
        fib(n);
        for (int i = 0; i<=n ; i++){
            System.out.print(fibbonacciCache[i]+" ");
        }
        System.out.println(fib(n));
    }
}