package Arrays_2D;

import java.util.Scanner;

public class SetMatrixZeroes {
    public static void setZeroes(int [][] matrix , int r, int c){
        for (int i =0;i<r;i++){
            for (int j =0;j<c;j++){
                if ((i+j) % 2 != 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // For Print Matrix

        for (int i = 0;i<r;i++){
            for (int j =0;j<c;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
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
        setZeroes(matrix ,  r , c);
    }
}
