package src.pepCoding.StacksAndQueue.NGE;

import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i =0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] ans = sol(arr,4);
        for (int i =0; i <ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] sol(int[] nums, int k) {

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums.length];
        st.push(nums.length - 1);
        nge[nums.length - 1] = nums.length;
        for(int i = nums.length - 2; i >= 0; i--){
// -a+
            while(st.size() > 0 && nums[i] >= nums[st.peek()]){
                st.pop();
            }
                if(st.size() == 0){
                    nge[i] = nums.length;
                } else {
                    nge[i] = st.peek();
                }
                    st.push(i);
        }
        int j =0;
        for (int i = 0; i <= nums.length-k; i++){
            if(j<i){
                j=i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }
        }
        return nge;
    }


}
