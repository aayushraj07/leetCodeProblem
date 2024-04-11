package src.pepCoding.BinarySearch;

public class SortedRoatated {

    public static void main(String[] args) {
        int[] arr = {14,15,20,22,3,5,7,9,11};
//        TC -> O(logn)
//        SC -> O(1)
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        int left =0;
        int right =arr.length-1;

        while(left<right){
            int mid = (left+ right)/2;
            if(arr[mid] < arr[right]) {
//                that means right side is sorted, so we will cancel that part
                right=mid;
            }else{
                left = mid+1;
            }
        }
        return arr[left];
    }
}
