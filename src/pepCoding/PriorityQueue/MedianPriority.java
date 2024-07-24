package src.pepCoding.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPriority {
    public static void main(String[] args) {
        int[] arr = {2,13,14,44,32,5,20,6,12,8};
//        2,5,6,8,12,13,14,20,44,32
        System.out.println(median(arr));
    }


    private static int median(int[] arr) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();
        left.add(arr[0]);
        for (int i =1; i< arr.length; i++){
            if(right.isEmpty() || right.peek() < arr[i] ){
                right.add(arr[i]);
                if(right.size()-left.size() > 1){
                    left.add(right.peek());
                    right.remove();
                }
                if(left.size()- right.size() > 1){
                    right.add(left.peek());
                    left.remove();
                }
            } else{
                left.add(arr[i]);
                if(right.size()-left.size() > 1){
                    left.add(right.peek());
                    right.remove();
                }
                if(left.size()- right.size() > 1){
                    right.add(left.peek());
                    left.remove();
                }
            }
        }

        int med = 0;
        if(left.size() == right.size()){
            med = left.peek();
        }else {
            if (left.size() > right.size()) {
                med = left.peek();
            } else{
                med = right.peek();
            }
        }
    return med;
    }
}
