package src.pepCoding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class KeyPad {
    public static void main(String[] args) {
        String digits = "";
        letterCombinations(digits);
    }

    static String[] codes = {"", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","*","0","#"};

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = digits.charAt(0);
        String ros = digits.substring(1);

        List<String> rres = letterCombinations(ros);
        List<String> mres = new ArrayList<>();

        String codeforCh = codes[ch - '0'];
        codeforCh.charAt(0);
        for(int i = 0; i< codeforCh.length(); i ++){
            char chcode = codeforCh.charAt(i);
            for(String rstr : rres){
                mres.add(chcode+rstr);
            }
        }
        for(String mre : mres){
            System.out.print(mre + " ");
        }

        return mres;

    }
}
