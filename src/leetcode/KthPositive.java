package src.leetcode;

public class KthPositive {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int val = findKthPositive(arr, k);
        System.out.println(val);
    }
        public static int findKthPositive(int[] arr, int k) {
//                int miss = 0;
//                int index = 0;
//                int curr = 0;

            int miss = 0;
            int num = 1;
            int index = 0;
            int pos = 0;



            while (miss < k) {
                if (index >= arr.length) {
                    miss++;
                    num = index + 1;
                } else {
                    if (index <= arr.length - 1) {
                        if(index+1 != arr[index]){
                            miss++;
                            num = index + 1;
                        }
                    }
                }
                index++;
            }
            return num;

//            while (miss <= k) {
//                if ((index + 1) >= arr.length) {
//                    miss++;
//                } else {
//                    if (arr[curr] != arr[index]) {
//                        miss++;
//                    }else{
//                        curr++;
//                    }
//                }
//                index++;
//            }
//            return index+1;
        }
    }

