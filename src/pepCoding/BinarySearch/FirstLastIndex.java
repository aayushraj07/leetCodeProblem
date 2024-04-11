package src.pepCoding.BinarySearch;

public class FirstLastIndex {
    public static void main(String[] args) {
//        array should be sorted
        int [] arr = {1,2,2,3,4,4,4,5,6,7};
        int target = 9;
        solution(arr, target);
//        TC -> O(Log n)
//        SC -> O(1)
    }

    private static void solution(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int first = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid -1;
            }else if(arr[mid] < target){
                low = mid +1;
            }else{
                first = mid;
                high = mid-1;
            }
        }

        low = 0;
        high = arr.length-1;
        int last = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid -1;
            }else if(arr[mid] < target){
                low = mid +1;
            }else{
                last = mid;
                low = mid+1;
            }
        }

        System.out.println("first " + first);
        System.out.println("last " + last);
    }
}
