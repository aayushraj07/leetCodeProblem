package src.pepCoding.BackTracking;

public class Practice {
    public static void main(String[] args) {
        int x =5;
        int y =3;
        solution(x,y);

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        compareMatrix(matrix1,matrix2);
    }

    private static boolean compareMatrix(int[][] matrix1, int[][] matrix2) {
        return true;
    }

    private static void solution(int x, int y) {
        if(y>x){
            return;
        }
        System.out.println(x + ", " + y);
        solution(x,y+1);
    }
}
