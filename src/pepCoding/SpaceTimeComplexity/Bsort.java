package src.pepCoding.SpaceTimeComplexity;

public class Bsort {

    public static void main(String[] args) {
        int[] arr = {11,22,13,14,7};

        int flag;
        for (int i = 0; i< arr.length-1; i++){
            flag =0;
            for (int j = 0 ; j < arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                    flag =1;
                }
            }
            if (flag==0){
                break;
            }
        }

        for (int i = 0; i<arr.length;i++){
            if(i != arr.length-1) {
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
