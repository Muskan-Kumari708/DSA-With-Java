package Arrays_2D;

import java.util.Scanner;

public class Column_Wise_Traversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 2;
        int c = 3;
        int [][] matrix = new int[r][c];
        for (int i =0;i<r;i++){
            for (int j = 0;j<c;j++){
              matrix[i][j] = sc.nextInt();
            }
        }

        for (int j =0;j<c;j++){
            for (int i=0;i<r;i++){
                System.out.print(matrix[i][j]+"\t");
            }
        }
    }
}
