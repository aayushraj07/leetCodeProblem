package src.pepCoding.SpaceTimeComplexity;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {4,9,2,1,4};
        for (int i = 1; i < arr.length; i++){
            for (int j = i-1; j>= 0; j --){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
