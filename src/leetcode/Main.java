package src.leetcode;


public class Main {


    public static void main(String[] args){
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("XXVII"));

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(33));

        ValidBrackets validBrackets = new ValidBrackets();
        System.out.println("Brackets questions: "+ validBrackets.isValid("[]{}({}})"));


        Prefixes prefixes = new Prefixes();
        String[] strings= new String[4];
        strings[0] ="Aayush";
        strings[1] = "Akash";
        strings[2] = "Arnav";
        strings[3] = "Ajeet";
        System.out.println(prefixes.longestCommonPrefix(strings));


        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("Number of Steps: " + climbingStairs.climbStairs(22));

    }
}
