package src.pepCoding.SpaceTimeComplexity;

import static src.pepCoding.SpaceTimeComplexity.PartitionArray.swap;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2,10,11,4,52,1,4,8,3};
        int lo = 0;
        int hi = arr.length-1;
        quickSort(arr,lo,hi);
        printArr(arr);
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);
    }

    public static int partition(int[] arr, int pivot, int lo, int hi){
        System.out.println("Pivot -> " + pivot);
        int i = lo, j = lo;
        while(i<=hi){
         if(arr[i] <= pivot){
             swap(arr, i, j);
                 i++;
                 j++;
             }else{
                 i++;
             }
         }
        System.out.println("pivot index -> " +(j-1));
        return (j-1);
        }

}

