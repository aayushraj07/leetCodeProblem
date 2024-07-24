package src.leetcode;

import java.util.*;


public class StringEncodeDecode {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("LEET", "Code", "Pseudo");
        String encoded = encode(str);
        decode(encoded);
    }

    public static String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for(String str: strs){
            st.append(str.length());
            st.append("#");
            st.append(str);
        }
        return st.toString();

    }

    public static List<String> decode(String str) {
        ArrayList<String> strings = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int delimiterIndex = str.indexOf('#', i);
            System.out.println(delimiterIndex);
            int length = Integer.parseInt(str.substring(i,delimiterIndex));
            i = delimiterIndex +1;
            String string = str.substring(i, i+ length);
            strings.add(string);
            i += length;
        }
        return strings;
    }
}
