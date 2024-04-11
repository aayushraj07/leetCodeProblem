package src.pepCoding.StacksAndQueue;

import java.util.Stack;

class RemoveOuterBracket {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("()()"));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> ans = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(ans.isEmpty()){
                    ans.push(ch);
                }else if(ans.peek() == '('){
                    ans.pop();
                    ans.push(ch);
                }else {
                    ans.push(ch);
                }
            }else{
                if(ans.peek() != ')'){
                    ans.push(ch);
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        while(!ans.isEmpty()){
            answer.append(ans.pop());
        }
        answer.reverse();
        String finalAns = answer.toString();
        return finalAns;
    }
}