package src.pepCoding.BackTracking;

public class TargetSumSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int target= 6;
        tss(arr, 0, "", 0, target );
    }

    private static void tss(int[] arr, int index,  String set , int sos, int target) {
        if(index==arr.length){
            if(sos == target){
                System.out.println(set + ".");
            }
            return;
        }

        tss(arr,index+1,set + arr[index] + " ", sos + arr[index],target);
        tss(arr,index+1,set , sos,target);


    }
}
