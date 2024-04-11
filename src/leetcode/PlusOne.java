package src.leetcode;

public class PlusOne {

    public static int[] plusOne(int[] digits){
        digits[digits.length-1] = digits[digits.length-1] + 1;

        for (int i=0;i<digits.length;i++){
            System.out.println(digits[i]);
        }
        return digits;
    }

    public static void main(String[] args){
        int[] digits = {1,2,4,4,5,1,-1,99};
        plusOne(digits);
    }
}

