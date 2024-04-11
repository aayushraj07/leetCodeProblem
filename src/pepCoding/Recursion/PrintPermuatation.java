package src.pepCoding.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintPermuatation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");

        System.out.println("Permutation for Numbers!");
        int [] arr = {1,2,3};
        printPermutationsNum(arr, 0, new boolean[arr.length], new ArrayList<>());
//        TC -> O(n!*m)
//        SC -> O(n)
    }

    private static void printPermutationsNum(int[] arr, int pos, boolean[] selected, ArrayList<Integer> ans) {
        if(pos == arr.length){
            System.out.println(ans);
            return;
        }

        for(int i =0; i<arr.length; i++){
            if(selected[i] == false){
                selected[i] =true;
                ans.add(arr[i]);
                printPermutationsNum(arr,pos+1,selected,ans);
                selected[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }

    private static void printPermutations(String ques, String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i =0; i<ques.length();i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0,i);
            String qrpart = ques.substring(i+1);
            String rof = qlpart+qrpart;


            printPermutations(rof,asf+ch);


        }
    }
}