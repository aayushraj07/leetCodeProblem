package src.pepCoding.StacksAndQueue;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String str = "(a)+()";
        System.out.println(checkDuplicate(str));
    }

    private static boolean checkDuplicate(String str) {
        Stack<Character> st = new Stack<>();

        for (int i =0; i <str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    return true;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        return false;
    }
}
