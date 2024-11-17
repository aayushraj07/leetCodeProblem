package src.leetcode;

import java.util.Stack;

public class LongestBrackets {

    public static void main(String[] args) {
        String str = "()(())";
        System.out.println(longestValidParentheses(str));
    }
    public static int longestValidParentheses(String str) {
        int count =0, left=0, right = 0;

        for (int i =0; i< str.length(); i++){
            if(str.charAt(i) == '('){
                left++;
            }else{
                right++;
            }
            if(left == right){
                count = Math.max(left *2 , count);
            }else if(right > left){
                left = 0;
                right =0;
            }
        }
        left = 0;
        right =0;
        for (int i =str.length()-1; i >= 0; i--){
            if(str.charAt(i) == '('){
                left++;
            }else{
                right++;
            }
            if(left == right){
                count = Math.max(left *2 , count);
            }else if(left > right){
                left = 0;
                right =0;
            }
        }
        return count;
    }
}
