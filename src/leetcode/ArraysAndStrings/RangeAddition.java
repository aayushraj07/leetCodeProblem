package src.leetcode.ArraysAndStrings;

import java.sql.Array;

public class RangeAddition {
    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {{1,3,2},{2,4,3},{0,2,-2}};
        int[] res = rangeAddition(queries,n);
        displayArr(res);

    }

    private static void displayArr(int[] res) {
        for (int i = 0; i< res.length; i++){
            System.out.print(res[i] + " " );
        }
    }

    private static int[] rangeAddition(int[][] queries, int n) {
        int[] res = new int[n];

//        provide impact to res
        for(int i =0; i< queries.length; i++){
            int sp = queries[i][0];
            int ep = queries[i][1];
            int val = queries[i][2];

            res[sp] += val;
            if(ep+1 < n){
                res[ep+1] -= val;
            }
        }

//        prefix sum
        int sum= 0;
        for (int i = 0; i< n; i++){
            sum += res[i];
            res[i] = sum;
        }
        return res;
    }
}
