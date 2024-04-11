package src.pepCoding.Recursion;

import java.util.ArrayList;

public class Subsquence {
    public static void main(String[] args) {
        String str= "abc";
        System.out.println(gss(str));
    }

    private static ArrayList<String> gss(String str) {
        if(str.isEmpty()){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char fchar =str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(String string : rres){
            mres.add(""+string);
            mres.add(fchar+string);
        }
        return mres;
    }
}
