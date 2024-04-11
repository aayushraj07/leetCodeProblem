package src.pepCoding.SpaceTimeComplexity;

public class MergeSortedArr {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,9};
        int arr2[] = {4,6,7};
        mergeTwoSortedArrays(arr1,arr2);
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


        for (int element : res){
            System.out.print(element + " ");
        }

        return res;
    }
}
