package src.leetcode.ArraysAndStrings;

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }

    private static boolean isPossible(String name, String typed) {
        if(typed.length() < name.length()){
            return false;
        }
        int i = 0;
        int j =0;

        while(i< name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(i > 0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            }else{
                return false;
            }
        }

        while(j < typed.length()){
            if(name.charAt(i-1) != typed.charAt(j)){
                return false;
            }else{
                j++;
            }
        }
        return i< name.length() ? false : true;
    }
}
