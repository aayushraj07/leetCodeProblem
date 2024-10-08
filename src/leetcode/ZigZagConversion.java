package src.leetcode;

public class ZigZagConversion {
    public static void main(String[] args) {
        String str = "A";
        int rows = 3;

//        uaadaAsjdasahdasdyRssd
//        AayushRajdsadasdasdasda
//          uaadaAsjdasahdasdyRssd
        System.out.println(zigZagConvert(str, rows));
    }

    private static String zigZagConvert(String str, int rows){
        StringBuilder ans = new StringBuilder();
        int index =0;
        int count = 1;
        while(index < str.length()){
            count = count + rows;
            if(count < str.length()){
                ans.append(str.charAt(count));
            }else {
                count = count - str.length();
                ans.append(str.charAt(Math.abs(count)));
            }
            count++;
            index++;
        }
        return ans.toString();

    }
}
