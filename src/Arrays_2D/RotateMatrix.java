package Arrays_2D;

import java.util.Scanner;

public class RotateMatrix {
    public static int [][] RotateAt90deg(int[][] matrix1, int r1,int c1){
        int [][] ans = new int[c1][r1];

        // For Transpose

        for (int i = 0;i<c1;i++){
            for (int j = 0;j<r1;j++){
                ans[i][j] = matrix1[j][i];
            }
        }

        // For Rotation

        for (int i = 0;i<c1;i++){
            for (int j=0;j<r1/2;j++){
                int t = ans[i][r1-j-1];
                ans[i][r1-j-1] = ans[i][j];
                ans[i][j] = t;

            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] matrix1 = new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                matrix1[i][j]= sc.nextInt();
            }
        }
        int [][] nums = RotateAt90deg(matrix1,r1,c1);
        for (int i=0;i<c1;i++){
            for (int j=0;j<r1;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
