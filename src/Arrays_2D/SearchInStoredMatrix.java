package Arrays_2D;

import java.util.Scanner;

public class SearchInStoredMatrix {
    public static void printStoredMatrix(int [][] matrix , int r, int c, int target){
        int i = 0; // left
        int j = c-1; //right
        while (i<r && j<c){
            if (matrix[i][j]  == target){
                System.out.println("find");
                break;
            } else if (matrix[i][j] < target) {
                i++;

            }
            else {
                j--;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the cols : ");
        int c = sc.nextInt();

        int [][] matrix = new int[r][c];
        for (int i =0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
            System.out.println("Enter the target : ");
            int target = sc.nextInt();

        printStoredMatrix(matrix,r,c,target);
    }
}
