package src.pepCoding.PriorityQueue;

import java.util.PriorityQueue;

public class Intro {
    public static void main(String[] args) {
        int[] arr = {1,3,41,2,42,11,32};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : arr){
            pq.add(n);
        }
        System.out.println("peek");
        System.out.println(pq.peek());
        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }



    }
}
