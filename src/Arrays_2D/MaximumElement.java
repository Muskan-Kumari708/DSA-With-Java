package Arrays_2D;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 2;
        int c = 3;
        int [][] matrix = new int[r][c];
        for (int i = 0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int largest = matrix[0][0];
        for (int i = 1;i<r;i++){
            for (int j = 1;j<c;j++){
                if (matrix[i][j] >largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
    }
}
