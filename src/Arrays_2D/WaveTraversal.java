package Arrays_2D;

import java.util.Scanner;

public class WaveTraversal {
    public static void printTraversal(int[][] matrix , int r , int c){
        int col = 0;

        while (col < c) {

            // For increasing rows

            for (int i = 0; i < r && col < c; i++) {
                System.out.print(matrix[i][col]);
            }

            col++;


            // For decreasing rows

            for (int i = r - 1; i >= 0 && col < c; i--) {
                System.out.print(matrix[i][col]);
            }
            col++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the col : ");
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        printTraversal(matrix , r , c);

    }
}
