package src.leetcode.ArraysAndStrings;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,1,1,3,9,3};
        int candidate = validCandidate(arr);
        int count = 0;
        for (int i =0; i< arr.length; i++){
            if(candidate == arr[i]){
                count++;
            }
        }
        if(count > (arr.length/2)){
            System.out.println(candidate + " is a majority winner");
        }else {
            System.out.println("No winner");
        }

    }
// Moore's Vooting Algorithm
    private static int validCandidate(int[] arr) {

        int value = arr[0];
        int count = 1;

        for (int i = 0; i< arr.length; i++){
            if(count == 0){
                value = arr[i];
                count = 1;
            }

            if(value == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        return value;
    }
}
