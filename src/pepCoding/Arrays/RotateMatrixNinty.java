package src.pepCoding.Arrays;

public class RotateMatrixNinty {

    public static void main(String[] args) {
            int[][] arr = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
//            Time complexity O(n^2)
//            Space complexity O(1)

            rotateBy90(arr);
        RotateMatrixNinty rotateMatrixNinty = new RotateMatrixNinty();
        rotateMatrixNinty.print(arr);
//            print(arr);
    }

    private void print(int[][] arr) {
        for(int[] a: arr){
            for (int val: a){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void rotateBy90(int[][] arr) {
        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j<arr[0].length; j++){
//                swap arr[i][j] with arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

//        Step 2
        int left = 0, right = arr[0].length-1;
        while(left < right){
            for(int i = 0; i< arr.length; i++){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

    }
}
