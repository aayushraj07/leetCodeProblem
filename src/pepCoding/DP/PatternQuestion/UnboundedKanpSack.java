package src.pepCoding.DP.PatternQuestion;

public class UnboundedKanpSack {
    public static void main(String[] args) {
        int[] weights =  {2,5,1,3,4};
        int[] values = {15,14,10,45,30};

        int totalW = 7;

        int[] dp = new int [totalW+1];
        dp[0] = 0;

        for(int bagC= 1; bagC <= totalW; bagC++){
            int max = 0;
            for (int i = 0; i < weights.length; i++){
                if(weights[i] <= bagC){
                    int rbagc = bagC - weights[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + values[i];

                    if(tbagv > max){
                        max = tbagv;
                    }
                }
            }
            dp[bagC] = max;
        }
        System.out.println(dp[totalW]);
    }
}

