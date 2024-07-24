package src.pepCoding.Arrays.TwoDimensional;

import java.util.ArrayList;

public class TwoDim {

    public static void main(String[] args) {
        int[] arr = new int[3];
        int[][] arrTwoDim = new int[3][2];
//        rows-cols
        arrTwoDim[0][0] = 2;
        arrTwoDim[0][1] = 1;
        arrTwoDim[1][0] = 3;
        arrTwoDim[1][1] = 4;
        arrTwoDim[2][0] = 5;
        arrTwoDim[2][1] = 6;

        for (int i =0; i<arrTwoDim.length;i++){
            for (int j =0; j<arrTwoDim[i].length;j++){
                System.out.print(arrTwoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
