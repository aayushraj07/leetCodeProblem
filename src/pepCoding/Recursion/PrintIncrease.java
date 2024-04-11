package src.pepCoding.Recursion;

public class PrintIncrease {
    public static void main(String[] args) {
//        printIncreasing(5);
//        printIncreaseDecrease(5);
        int f = factorials(5);
        System.out.println(f);


    }

    private static int factorials(int n) {
        if (n == 1) {
            return 1;
        }
        int numbers = factorials(n - 1);
        int factorial = numbers * n;
        return factorial;
    }

    private static void printIncreaseDecrease(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printIncreaseDecrease(n - 1);
        System.out.println(n);

    }

    private static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
        System.out.println("line 2");
        System.out.println("line 2");
        System.out.println("line 2");

    }
}
