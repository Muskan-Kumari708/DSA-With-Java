package SumOfRecatangle_2D;

import java.util.Scanner;

public class SumOverColumnsAndRows {
    public static int[][] FindPrefixSum(int [][] matrix, int r, int c){

        // Row Prefix

        for (int i = 0; i<r;i++){
            for (int j = 1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // Column Prefix

        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
        return matrix;

    }
    public static int findSum(int [][] matrix , int l1,int r1,int l2,int r2 ){
        int sum = 0;
        int up = 0;
        int left = 0;
        int leftUp = 0;

        sum = matrix[l2][r2];

        if (r1 >= 1){
            up = matrix[l1-1][r2];
        }
        if (r1 >= 1){
            left = matrix[l2][r1-1];
        }
        if (r1 >= 1){
            leftUp = matrix[l1-1][r1-1];
        }

        int ans = sum - up - left + leftUp;

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the col : ");
        int c = sc.nextInt();
        int [][] rec = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                rec[i][j]= sc.nextInt();
            }
        }

        //PrintMatrix

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(rec[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter the Rectangle in l1 r1 l2 r2 : ");
        int l1 = sc.nextInt(); // row
        int r1 = sc.nextInt();
        int l2 = sc.nextInt(); //col
        int r2 = sc.nextInt();
        FindPrefixSum(rec,r,c);
        System.out.println("Rectangle Sum is : " + findSum(rec,l1,r1,l2,r2));
    }
}
