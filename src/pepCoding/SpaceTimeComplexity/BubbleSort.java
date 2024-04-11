package src.pepCoding.SpaceTimeComplexity;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 2, 1};
        print(arr);
        boolean somethingToSort = true;
        while (somethingToSort) {
            somethingToSort = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    somethingToSort = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println();
        print(arr);
    }

    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
