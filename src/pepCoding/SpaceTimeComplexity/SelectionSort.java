package src.pepCoding.SpaceTimeComplexity;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {1,4,6,2,3};
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int i =0; i < arr.length-1; i++){
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }


}
