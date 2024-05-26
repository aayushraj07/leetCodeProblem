package src.practice.RecursionPractice;

public class BasicForLoop {
    public static void main(String[] args) {
        int target = 4;
//        fn(target);
        int val = factorial(target);
        System.out.println(val);
    }

    private static int factorial(int target) {
        if(target == 1){
            return 1;
        }
        int fnm1 =factorial(target - 1);
        int val = fnm1 * target;
        return val;
    }


    private static void fn(int target) {
        if(target == 0){
            return;
        }
        fn(target-1);
        System.out.println(target);
    }
}
