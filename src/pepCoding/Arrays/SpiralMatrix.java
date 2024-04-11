package src.pepCoding.Arrays;

public class SpiralMatrix {

    public static void main(String[] args) {
        int arr[][] ={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        printSpiral(arr);

    }
    private static void printSpiral(int[][] arr) {
        int cmin = 0, rmin = 0;
        int cmax = arr[0].length - 1;
        int rmax = arr.length - 1;
        int n = arr.length;
        int m = arr[0].length;

        int count = 0;
        while (count < n * m) {
//        print top Boundary
            for (int col = cmin; col <= cmax && count < n*m; col++) {
                System.out.print(arr[rmin][col] + " ");
                count++;
            }
            rmin++;

//        print right Boundary
            for (int row = rmin; row <= rmax && count < n*m; row++) {
                System.out.print(arr[row][cmax] + " ");
                count++;
            }
            cmax--;

//        print bottom Boundary
            for (int col = cmax; col >= cmin && count < n*m; col--) {
                System.out.print(arr[rmax][col] + " ");
                count++;
            }
            rmax--;

//        print left Boundary
            for (int row = rmax; row >= rmin && count < n*m; row--) {
                System.out.print(arr[row][cmin] + " ");
                count++;
            }
            cmin++;
        }
    }

}
