package src.pepCoding.DP.IncludExcludeSign;

public class CountBinaryString {
    public static void main(String[] args) {
        int n = 4;

        int ocz = 1;
        int oco = 1;

        for(int i = 2;  i<= n; i++){
            int ncz = ocz;
            int nco = oco+ocz;

            ocz = ncz;
            oco = nco;
        }
        System.out.println(oco+ocz);
    }
}
