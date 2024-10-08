package src.pseudoCode;

public class Casting {
    public static void main(String[] args) {
        String str ="312412";
        str = str.trim();
        int res =0;
        for (int i =0; i< str.length(); i++){
            int n = str.charAt(i) - '0';
            res = res * 10 + n;

        }

        System.out.println(res);

    }
}
