package src.pepCoding.StacksAndQueue;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},
                {0,1,0,1},
                {1,1,1,1},
                {0,0,0,1}};

        findCelebrity(arr);
    }

    private static void findCelebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();

//        find the celebrity
        for (int i =0; i< arr.length; i++){
            st.push(i);
        }

        while(st.size()>=2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
//                if i knows j -> i is not a celebrity
                st.push(j);
            }else{
//                if i doesnt know j -> j is not a celebrity

                st.push(i);
            }
        }
//        Verify the Celebrity candidate

        int pot = st.pop();
        for (int i = 0; i< arr.length; i++){
            if(i!=pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("none");
                    return;
                }
            }
        }

        System.out.println(pot);
    }
}
