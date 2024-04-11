package src.pepCoding.SpaceTimeComplexity;

import static src.pepCoding.SpaceTimeComplexity.PartitionArray.swap;

public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = {2,10,11,4,52,1,4,8,3};
        int target = 3;
        quickSelect(arr, 0, arr.length-1, target-1);
    }

    private static int quickSelect(int[] arr, int lo, int hi, int target) {
        int pivot =arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        if(target>pi){
            return quickSelect(arr,pi+1,hi,target);
        }else if(target<pi){
            return quickSelect(arr,lo,pi-1,target);
        }else{
            return pivot;
        }
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
