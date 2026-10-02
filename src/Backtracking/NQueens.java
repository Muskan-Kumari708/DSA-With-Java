package Backtracking;

public class NQueens {
    public  static void helper(char[][] board, int row){
        int n = board.length;
        if (row == n){
            for (int i=0;i< board.length;i++){
                for (int j=0;j< board.length;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                helper(board,row+1);
                board[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        // for row
        for (int j=0;j<n;j++){
            if (board[row][j] == 'Q'){
                return false;

            }
        }
        // for col
        for (int i =0;i<n;i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        // for NE
        int i = row;
        int j = col;
        while (i>=0 && j<n){
            if (board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;

        }
        // for SE
        i = row;
        j = col;
        while (i<n && j<n){
            if (board[i][j] == 'Q'){
                return false;
            }
            i++;
            j++;

        }
        // for WS
        i = row;
        j = col;
        while (i<n && j>=0){
            if (board[i][j] == 'Q'){
                return false;
            }
            i++;
            j--;

        }
        // for NW
        i = row;
        j = col;
        while (i>=0 && j>=0){
            if (board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;

        }
        return true;
    }
    static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i=0;i< board.length;i++){
            for (int j=0;j< board.length;j++){
                board[i][j] = '.';
            }
        }
        helper(board,0);
    }
}
