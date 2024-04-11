package src.pepCoding.Recursion;//package Scaler.Recursion;
//
//import java.util.ArrayList;
//
//public class TargetSumSubSet {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,-1};
//        int target =5;
//        ArrayList<Integer> answers = new ArrayList<>();
//        solution(arr,target,0, answers);
//    }
//
//    private static void solution(int[] arr, int target, int idx, ArrayList<Integer> answers) {
//        if(idx == arr.length){
//            return;
//        }
//
//        if(target - arr[idx]){
//            answers.add(arr[idx]);
//            solution(arr,target,idx+1, answers);
//
//        }
//
//    }
//}
