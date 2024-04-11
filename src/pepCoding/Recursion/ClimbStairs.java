package src.pepCoding.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairs(n);
        System.out.println(paths);
    }

    private static ArrayList<String> getStairs(int n) {
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getStairs(n-1);
        ArrayList<String> path2 = getStairs(n-2);
        ArrayList<String> path3 = getStairs(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : path1){
            paths.add(1 + path);
        }
        for (String path : path2){
            paths.add(2 + path);
        }
        for (String path : path3){
            paths.add(3 + path);
        }
        return paths;
    }
}
