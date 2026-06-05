package SumOfRecatangle_2D;

import java.util.Scanner;

public class HorizontalSumEachRow {
    public static int[][] FindPrefixSum(int [][] matrix, int r, int c){
        for (int i = 0; i<r;i++){
            for (int j = 1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        return matrix;

    }
    public static int findSum(int [][] matrix , int l1,int r1,int l2,int r2 ){
        int sum = 0;
        for (int i=l1; i<=l2 ; i++){
            if (r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else {
                sum += matrix[i][r2];
            }
        }
        return sum;
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
        System.out.println("Enter the Rectangle in l1 l2 r1 r2 : ");
        int l1 = sc.nextInt(); // row
        int r1 = sc.nextInt();
        int l2 = sc.nextInt(); //col
        int r2 = sc.nextInt();
        FindPrefixSum(rec,r,c);
        System.out.println("Rectangle Sum is : " + findSum(rec,l1,r1,l2,r2));
    }
}
