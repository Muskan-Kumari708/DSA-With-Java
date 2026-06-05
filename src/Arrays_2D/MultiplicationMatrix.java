package Arrays_2D;

import java.util.Scanner;

public class MultiplicationMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] matrix1 = new int[r1][c1];
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] matrix2 = new int[r2][c2];
        int [][] matrix = new int[r1][c2];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum =0;
               for (int k =0;k<c1;k++){
                   sum = sum + matrix1[j][k] * matrix2[j][k];
                   matrix1[i][j] = sum;
               }
            }
            System.out.println();
        }
        for (int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(matrix1[i][j]);
            }
        }
    }
}
