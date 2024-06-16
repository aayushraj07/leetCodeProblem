package src.leetcode.ArraysAndStrings;

public class NextGreaterElementIII {

    public static void main(String[] args) {
        String num = "631542";
        nextGreater(num);
    }

    private static String nextGreater(String num) {
        char[] arr= num.toCharArray();
        int i = arr.length-2;
        while(i >= 0 && arr[i + 1] <= arr[i]){
            i--;
        }
        if(i == -1){
            return "-1";
        }
//        find just greater
        int k =arr.length-1;
        while(arr[k] <= arr[i]){
            k--;
        }
//        swap i from k
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;

//        concatenate from 0 to i index;
        String res = "";
        for(int j =0; j <= i; j++){
            res += arr[j];
        }
//        concatenate from k to i+1 index in reverse order;
        for(int j = arr.length-1; j> i; j--){
            res += arr[j];
        }

//        // Step 4: Reverse the sequence after the original i
//        int left = i + 1;
//        int right = arr.length - 1;
//        while (left < right) {
//            temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//
//        // Convert the array back to a number
//        long result = Long.parseLong(new String(arr));
//
//        // Check if the result fits within the 32-bit signed integer range
//        return (result <= Integer.MAX_VALUE) ? (int) result : -1;



        System.out.println(num);
        System.out.println(res);
        return  res;
    }
}
