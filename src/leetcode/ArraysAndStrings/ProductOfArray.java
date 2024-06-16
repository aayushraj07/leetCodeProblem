package src.leetcode.ArraysAndStrings;

public class ProductOfArray {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1, 4, 2, 5, 15});
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] right = new int[nums.length];
        int[] res = new int[nums.length];
        int prod = 1;
        for(int i = nums.length-1 ; i >= 0; i--){
            prod *= nums[i];
            right[i] = prod;
        }

        prod =1;
        for(int i = 0; i < nums.length-1; i++){
            int lp = prod;
            int rp = right[i+1];

            res[i]= lp*rp;
            prod *= nums[i];
        }
        res[nums.length -1] = prod;
        return res;

        // int mul =1;
        // for(int i = 0; i<= nums.length-1; i++){
        //     if(i == 0){
        //         res[0] = right[i+1];
        //     }else if(i == nums.length-1){
        //         res[i] = left[i-1];
        //     }else{
        //         res[i] = left[i-1] * right[i+1];
        //     }
        // }

        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];

        // for(int i = 0; i <= nums.length-1; i++){
        //     if(i == 0){
        //         left[i] = nums[i];
        //     }else{
        //         int mul = nums[i] * left[i-1];
        //         left[i] = mul;
        //     }
        // }

        // for(int i = nums.length-1 ; i >= 0; i--){
        //     if(i == nums.length-1){
        //         right[i] = nums[nums.length-1];
        //     }else{
        //     int mul = nums[i] * right[i+1];
        //     right[i] = mul;
        //     }
        // }
        // for(int i = 0 ; i <= nums.length-1; i++){
        //     System.out.print(left[i] + " ");
        // }

        // System.out.println();

        // for(int i = 0 ; i <= nums.length-1; i++){
        //     System.out.print(right[i] + " ");
        // }


        // int[] res = new int[nums.length];

        // for(int i = 0; i<= nums.length-1; i++){
        //     if(i == 0){
        //         res[0] = right[i+1];
        //     }else if(i == nums.length-1){
        //         res[i] = left[i-1];
        //     }else{
        //         res[i] = left[i-1] * right[i+1];
        //     }
        // }

        // // [1,2,3,4]
        // // l = [1,2,6,12]
        // // r = [24,24,12,4]
        // // res = []

        // return res;

    }
}
