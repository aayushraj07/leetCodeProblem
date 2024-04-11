package src.pepCoding.DP.PatternQuestion;

public class KnapSack {


    public static void main(String[] args) {
//        int totalBall = 7;
//        int[] run = {15,14,10,45,30};
//        int[] ball = {2,5,1,3,4};
//        int[][] dp = new int[ball.length+1][totalBall+1];
//        for(int i = 1; i < dp.length; i++){
//            for(int j = 1; j < dp[0].length; j++){
//                dp[i][j] = dp[i - 1][j];
//                if(j >= ball[i-1]){
//                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - ball[i - 1]] + run[i - 1]);
//                }
//            }
//        }
//        System.out.println(dp[ball.length][totalBall]);



        int n =3;
        int totalWeight = 4;
        int[] values = {4,3,8};
        int[] weight = {2,2,3};


        int[][] dp = new int[weight.length+1][totalWeight+1];

        for(int i = 1; i <dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                dp[i][j] = dp[i-1][j];
                if(j >= weight[i-1]){
                    dp[i][j] = Math.max(values[i-1]+ dp[i-1][j- weight[i-1]],dp[i][j]);
                }
            }
        }
        System.out.println(dp[weight.length][totalWeight]);
    }









//    int cap = scn.nextInt();
//    int[][] dp = new int[n + 1][cap + 1];
//    for(int i = 1; i ‹ dp.length; i++){
//        for(int j = 1; j ‹ dp[0].length; j++){
//            if(j >= wts[i - 1]){
//                int rCap = j - wts[i - 1];
//                if(dp[i - 1][rCap] + vals[i - 1] > dp[i - 1][j]){
//                    dp[i][j] = dp[i - 1][rCap] + vals[i - 1];
//                } else {
//                    dp[i][j] = dp[i - 1][j]; // when i doesn't bat
//                }
//            } else {
//                dp[i][j] = dp[i - 1][j]; // when i doesn't bat
}
