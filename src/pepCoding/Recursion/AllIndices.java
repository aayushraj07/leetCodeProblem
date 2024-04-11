package src.pepCoding.Recursion;

public class AllIndices {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 3, 2, 3};
        int x = 2;
        int[] answr = fn(arr, x, 0, 0);
        for (int i = 0; i < answr.length; i++) {
            System.out.print(answr[i] +" ");
        }
    }


    private static int[] fn(int[] arr, int x , int idx, int fsf){

        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == x){
            int[] iarr = fn(arr, x, idx+1, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }else{
            int[] iarr = fn(arr, x, idx+1, fsf);
            return iarr;
        }
    }
}
