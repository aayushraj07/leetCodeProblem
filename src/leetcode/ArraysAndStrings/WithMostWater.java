package src.leetcode.ArraysAndStrings;

public class WithMostWater {
    public static void main(String[] args) {
        int[] heights= {1,2,4,5,3,5,6};
        System.out.println(mostWater(heights));
    }

    private static int mostWater(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int water = 0;
        while(i < j){
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
            water = Math.max(water, (j-i) * Math.min(heights[i], heights[j]));
        }
        return water;

    }
}
