package src.pepCoding.BinarySearch;

public class Ques {

    public static void main(String[] args) {
        int[][] arr =  {
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        int B = 3;
        searchMatrix(arr, B);

    }
    public static int searchMatrix(int[][] A, int B) {
        int cmin=0;
        int cmax= A.length-1;
        int rmin = 0;
        int rmax = A[0].length-1;
        int potrow =-1;

        while(cmin<=rmax){
            int mid = (cmin+rmax)/2;
            if(B==A[mid][0]){
                potrow = mid;
                break;
            }
            if(mid<rmax){
                if(B<= rmax){
                    cmin = mid+1;
                }
            }else{
                if(B>= cmin){
                    rmax = mid-1;
                }
            }
        }

        if(potrow==-1){
            return 0;
        }


        while(rmin<cmax){
            int midcol = (rmin+cmax)/2;
            if(A[potrow][midcol] == B){
                return 1;
            }
            if(midcol<cmax){
                cmin= midcol+1;
            }else{
                rmax= midcol-1;
            }
        }
        return 0;

    }


}
