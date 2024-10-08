package src.leetcode.ArraysAndStrings;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }

    private static Integer maxProfit(int[] prices) {
         int maxPrice =0;
         int msf = 0;
         int[] auxArr = new int[prices.length];
         for(int i = prices.length-1; i >= 0; i--){
             if(prices[i]>msf){
                 msf = prices[i];
             }
             auxArr[i] = msf;
         }

         for(int i=0; i < prices.length; i++){
             int diff = auxArr[i] - prices[i];
             if(maxPrice < diff){
                 maxPrice = diff;
             }
         }

         return maxPrice;
    }
}
