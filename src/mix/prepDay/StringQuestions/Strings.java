package prepDay.StringQuestions;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

//        String s1 = "hello";
        String s1 = scn.nextLine();
//        String s2 = scn.nextLine();
        System.out.println(s1);
//        System.out.println(s2);

//        String s = scn.nextLine();
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        for(int i=0; i <s1.length(); i++){
            System.out.print(s1.charAt(i)+"\t");
        }

//        Substring
        System.out.println();
        System.out.println(s1.substring(0,3));

        for(int i =0;i<s1.length();i++){
            for(int j=i+1; j < s1.length();j++){
                System.out.println(s1.substring(i,j));
            }
        }
//       Split

        String[] part = s1.split(",");
        System.out.println("split");
        for(int i=0;i<part.length;i++){
            System.out.println(part[i]);
        }
    }
}
