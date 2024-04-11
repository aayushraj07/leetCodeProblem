package src.pepCoding.StacksAndQueue.NGE;

import java.util.Stack;

public class NextGraterElement {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,9,10,2,5,14,15};
        System.out.println("first appraoch");
        int ans1[] = nextGreatest(arr);
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println("Answer : ");
        for (int n : ans1){
            System.out.print(n + " ");
        }
        System.out.println("Second Approach");
        int ans[] = nextGreatest1(arr);
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println("Answer : ");
        for (int n : ans){
            System.out.print(n + " ");
        }
    }

    private static int[] nextGreatest(int[] arr) {
        Stack<Integer> numbers = new Stack<>();
        int[] answers = new int[arr.length];

        numbers.push(arr[arr.length-1]);
        answers[arr.length - 1] = -1;
        for (int i=arr.length-2; i>=0; i--){

            while(!numbers.isEmpty() && arr[i] >= numbers.peek()){
                numbers.pop();
            }
            if(numbers.size() == 0){
                answers[i] = -1;
            } else{
                answers[i] = numbers.peek();
            }

            numbers.push(arr[i]);
        }
        return answers;
    }

    int[] arr = {3 ,5,1,4,9,10,2,5,14,15};
    private static int[] nextGreatest1(int[] arr) {
        Stack<Integer> st = new Stack<>();

        int[] nge = new int[arr.length];
        st.push(0);

        for (int i =1; i<arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {

            int pos = st.peek();
            nge[pos] = arr[i];
            st.pop();
            }
            st.push(i);
            }
        while(!st.isEmpty()){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}
