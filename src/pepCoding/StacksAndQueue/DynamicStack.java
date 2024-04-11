package src.pepCoding.StacksAndQueue;

import java.util.Stack;

public class DynamicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
    }

    int tos = -1;
    int[] data = new int[5];
    void push(int val){
        if(tos == data.length-1){
            int[] ndata = new int[2* data.length];
            for (int i = 0; i< data.length; i++){
                ndata[i] = data[i];
            }
            data = ndata;

            tos++;
            data[tos] = val;
        }else{
            tos++;
            data[tos] = val;
        }
    }
}
