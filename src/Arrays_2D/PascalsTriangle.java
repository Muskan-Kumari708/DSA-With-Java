package Arrays_2D;

import java.util.Scanner;

public class PascalsTriangle {
    public static int[][] pascals(int [][] matrix , int n){
        for (int i=0;i<n;i++){
            for (int j =0;j<=i;j++){
                if (j == 0 || j== i){
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
                }
            }
        }
        return matrix;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];

        int [][] ans = pascals(matrix , n);

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}
