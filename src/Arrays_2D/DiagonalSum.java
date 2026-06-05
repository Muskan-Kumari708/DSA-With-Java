package Arrays_2D;

import java.util.Scanner;

public class DiagonalSum {
    public static int diagonal(int[][] matrix,int n){
        int sum = 0;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (i==j || i+j == n-1){
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Square Matrix : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int ans = diagonal(matrix,n);
        System.out.println("sum is : "+ans);

    }
}
