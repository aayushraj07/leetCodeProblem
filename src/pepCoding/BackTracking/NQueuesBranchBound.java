package src.pepCoding.BackTracking;

public class NQueuesBranchBound {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        boolean[] cols = new boolean[n];
        boolean[] ndig = new boolean[2 * n - 1];
        boolean[] rdig = new boolean[2 * n - 1];
        solve(board, 0, cols, ndig, rdig, "");
    }

    private static void solve(
            boolean[][] board, int row, boolean[] cols, boolean[] ndig, boolean[] rdig, String asf) {
        if(row == board.length){
            System.out.println(asf + ".");
            return;
        }

        for(int col =0; col < board[0].length; col++){
            if(!cols[col] && !ndig[row + col] &&
                    !rdig[row - col + board.length - 1]){
                    board[row][col] =true;
                    cols[col] = true;
                    ndig[row+col] =true;
                    rdig[row -col+ board.length-1] = true;
                    solve(board,row+1, cols,ndig,rdig,asf+row+"-"+col);
                    board[row][col] = false;
                    cols[col] = false;
                    ndig[row+col] =false;
                    rdig[row -col+ board.length-1] = false;
            }
        }
    }
}
