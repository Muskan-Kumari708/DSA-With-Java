package Arrays_2D;

import java.util.Scanner;

public class Transpose_matrix {
    public static int[][] transpose(int [][] matrix,int r,int c){
        int [][] ans = new int[c][r];
        for (int i = 0;i<c;i++){
            for (int j = 0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row : ");
        int r = sc.nextInt();
        System.out.println("Enter the column : ");
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int [][] nums = transpose(matrix,r,c);
        for (int i = 0;i<c;i++){
            for (int j = 0;j<r;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
