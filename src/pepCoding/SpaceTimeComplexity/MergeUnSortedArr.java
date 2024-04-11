package src.pepCoding.SpaceTimeComplexity;

public class MergeUnSortedArr {

    public static void main(String[] args) {
        int arr[] = {1,4,9,2,8,7,4,22};
        int lo=0;
        int hi = arr.length-1;
        int result[] = mergeSort(arr, lo, hi);
        for (int n : result){
            System.out.print(n + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int lo,int hi){
        if(lo==hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo+hi)/2;
        int[] fsh =mergeSort(arr,lo,mid);
        int[] ssh =mergeSort(arr,mid+1,hi);
        int[] fsa =mergeTwoSortedArrays(fsh,ssh);
        return fsa;
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){

        int res[] = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] > arr2[j]){
                res[k] = arr2[j];
                j++;
                k++;
            }else{
                res[k] = arr1[i];
                i++;
                k++;
            }
        }

        while(i< arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j< arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }
}
