package src.pepCoding.StacksAndQueue;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "[()][[[";
        System.out.println(balanceBrackets(str));
    }
    private static boolean balanceBrackets(String str) {
    Stack<Character> brackets = new Stack<>();
    for (int i =0; i< str.length(); i++){
        char ch = str.charAt(i);
        if(ch == '{' || ch == '(' || ch == '['){
            brackets.push(ch);
        }else if(ch == '}' || ch == ')' || ch == ']'){
            if (brackets.isEmpty()){
                return false;
            }
            if(brackets.peek() == '{' || brackets.peek() == '(' || brackets.peek() == '['){
                brackets.pop();
            }else{
                return false;
            }
        }
    }
        return brackets.isEmpty();
    }
}
