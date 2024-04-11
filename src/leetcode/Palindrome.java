package src.leetcode;

public class Palindrome {

    public static boolean isPalindrome(int x) {
    // public static boolean palindromeCheck()
    if(x == 0){
        return true;
    }
    if(x < 0 || x % 10 == 0){
        return false;
    }

    int temp = x;
    int rev=0, rem;

    while(temp != 0){
        rem = temp%10;
        rev = rev * 10 + rem;
        temp /= 10;
    }

    if(rev == x){
        System.out.println("Number is Palindrome");
        return true;
    }else{
        System.out.println("Number is not Palindrome");
        return false;
    }

    // while(x>rev){
    //     int pop = x % 10;
    //     x /= 10;

    //     rev = (rev * 10) + pop;
    // }

    // if(x == rev || x == rev/10){
    //     return true;
    // }else{
    //     return false;
    // }

}
    
    
    public static boolean palCheck(int x){

        // public static boolean palindromeCheck()
        if(x == 0){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }

        int temp = x;
        int rev = 0, rem = 0;

        while(temp != 0){
            rem = temp/10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if(rev == x){
            return true;
        }else{
            return false;
        }

    }

    public static void palindromeCheck(int x){
        int rev = 0;
        int dig = 0;
        while (x  > 0){
            dig = x % 10;
            rev = rev * 10 + dig;
            x = x /10;
        }
        if(x == rev){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }

    public static void main(String[] args){
        isPalindrome(121);
    }
}
