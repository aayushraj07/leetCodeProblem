package src.pepCoding.PriorityQueue;

import java.util.PriorityQueue;

public class SortUnsorted {

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,7,5,8,9};
        sort(arr, 2);
    }

    private static void sort(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i =0; i <= k ; i++){
            pq.add(arr[i]);
        }

        for (int i = k+1; i< arr.length; i++){
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }
    }
}
