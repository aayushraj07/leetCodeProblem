package src.pepCoding.SpaceTimeComplexity;

public class PartitionArray {

    public static void main(String[] args) {
        int arr[] = {4,23,2,1,9,6,7,8};
        int pivot = 5;
        int i = 0;
        int j = 0;

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
        while(i < arr.length){
            if(arr[i] > pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        printArr(arr);
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}