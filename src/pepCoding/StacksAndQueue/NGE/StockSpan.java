package src.pepCoding.StacksAndQueue.NGE;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        int[] span = stockSpan(arr);
        for (int i =0; i <span.length; i++){
            System.out.print(span[i] + " ");
        }
    }

    private static int[] stockSpan(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int[] span = new int[arr.length];
        stk.push(0);
        span[0] = 1;

        for (int i = 1; i<arr.length; i++){
            while(stk.size() > 0 && arr[i] > arr[stk.peek()]){
                stk.pop();
            }
            if (stk.size() == 0){
                span[i] = i +1;
            }else {
                span[i] = i - stk.peek();
            }

            stk.push(i);
        }
        return span;
    }
}
