package src.pepCoding.PriorityQueue;

import java.util.PriorityQueue;

public class KLargestElement {

    public static void main(String[] args) {
        int[] arr = {2,10,5,17,7,18,5,3};
        int k = 3;
        largestK(arr,k);
    }

    private static void largestK(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : arr){
            pq.add(val);
        }

        for(int i = 0; i< arr.length; i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.size() > 0 ){
            System.out.println(pq.remove());
        }
//        System.out.println(pq);
    }

}
