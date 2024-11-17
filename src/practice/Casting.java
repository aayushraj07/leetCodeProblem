package src.practice;

import java.util.PriorityQueue;

public class Casting {
    public static void main(String[] args) {

        int[] arr = {2,9,2,41,42,1,2,3};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        for(int i : pq){
            System.out.println(pq.peek());
            pq.poll();
        }
//        String str ="312412";
//        str = str.trim();
//        int res =0;
////        for (int i =0; i< str.length(); i++){
////            int n = str.charAt(i) - '0';
////            res = res * 10 + n;
////
////        }
//
//        System.out.println(res);

    }
}
