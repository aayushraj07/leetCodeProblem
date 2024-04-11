package src.pepCoding.Recursion;

public class PrintArrayRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,2,7};
        int size = arr.length-1;
        int x = 7;
        print(arr, size);
        System.out.println("In Reverse Order");
        printReverse(arr,0);
        System.out.print("Maximum of Array is :" + max(arr,0));
        System.out.println("first index");
        System.out.println(firstIndex(arr, 0, x));
    }

    private static int firstIndex(int[] arr, int n, int x){
        if(n < 0)
            return -1;

        if(arr[n] == x)
            return n;

        int k = firstIndex(arr, n + 1, x);
        if(k != -1)
            return k;
        return -1;
    }

    private static int max(int[] arr, int idx) {
        if(idx == arr.length-1){
            return arr[idx];
        }
        int second = max(arr, idx+1);
        if(arr[idx] < second) {
            return second;
        }else{
            return arr[idx];
        }
    }

    private static void printReverse(int[] arr, int n) {
        if(n== arr.length){
            return;
        }
        printReverse(arr,n+1);
        System.out.println(arr[n]);
    }

    private static void print(int[] arr, int idx) {
        if(idx<0){
            return;
        }
        print(arr,idx-1);
        System.out.println(arr[idx]);
    }
}
