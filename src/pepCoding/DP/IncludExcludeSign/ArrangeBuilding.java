package src.pepCoding.DP.IncludExcludeSign;

public class ArrangeBuilding {

    public static void main(String[] args) {
        int n = 7;
        int obuildings = 1;
        int ospace = 1;

        for (int i = 2; i <= n; i++){
            int nbuildings = obuildings;
            int nspace = obuildings + ospace;

            obuildings = nbuildings;
            ospace= nspace;
        }

        int totalOnseSide = ospace+ obuildings;
        int total = totalOnseSide*totalOnseSide;

        System.out.println(total);
    }


}
