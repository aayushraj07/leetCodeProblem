package src.pepCoding.Recursion;

public class FirstLastIndex {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5,3,4,2,1};
        int[] range = new int[2];
        int target = 3;
        int fi = firstIndex(arr,0, target);
        System.out.println("First index: " + fi);
        int li = lastIndex(arr,arr.length-1, target);
        System.out.println("Last index : " + li);
    }

    private static int lastIndex(int[] arr, int index, int target) {
        if(index == 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return lastIndex(arr, index - 1, target);
            }

    }

    private static int firstIndex(int[] arr, int index, int target) {

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }else {
            return firstIndex(arr, index + 1, target);
        }
        }
}
