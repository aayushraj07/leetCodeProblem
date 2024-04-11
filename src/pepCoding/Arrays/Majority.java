package src.pepCoding.Arrays;

import java.util.Arrays;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,5,1,1,2,2,2,6,5,6,1,1,2,2,2};
        int[] arr2 = {6,5,5};
//        marjoirty(arr,arr.length);
        mooreVoting(arr2,arr2.length);
//        TC -> O(n)
//        SC -> O(1)
    }


    private static void mooreVoting(int[] arr, int length) {
        int pc = arr[0];
        int count = 1;
        int frequency = 0;
        for(int i=1; i<length; i++){
            if(arr[i] == pc){
                count++;
            }else {
                count --;
            }
            if(count == 0){
                pc = arr[i];
                count  =1;
            }
        }

//        verify the Potential Candidate;
            for(int number : arr){
                if(number == pc){
                    frequency++;
                }
            }
            if(frequency > length/2){
                System.out.println("Number with Majority is " + pc);
            }else{
                System.out.println("No majority!");
            }
    }

    private static void marjoirty(int[] arr, int length) {
        Arrays.sort(arr);
        int count =0;
        for(int i = 0; i < length; i++){
            if(arr[i] == arr[i-1]){
                count++;
                if(count > length/2){
                    System.out.println(i);
                }
            }else{
                count =0;
            }
        }
    }

}

