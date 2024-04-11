package src.pepCoding.BackTracking;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int[] arr = new int[n];
        boolean[] boolArr = new boolean[n];
        int answer = sol(n,k);
        System.out.println(answer);
//        solution(arr,boolArr,n,k);
    }

    private static int sol(int n, int k) {
        if(n==1){
            return 0;
        }

        int x = sol(n-1,k);
        int y = (x+k)%n;
        return y;
    }

    private static int solution(int[] arr, boolean[] boolArr, int n, int k) {


        for(int i =0; i< arr.length;i++){
            boolArr[i+k] = false;
        }

//        for (boolean bool : boolArr){
//            System.out.println(bool);
//        }

        return 0;






    }
}
