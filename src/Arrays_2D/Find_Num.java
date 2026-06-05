package Arrays_2D;

import java.util.Scanner;

public class Find_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int cols = sc.nextInt();
        int x = 9;
        int[][] arr = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (x==arr[i][j]){
                    System.out.println("Find Number("+ i + " , "+ j +")");
                }
            }
        }
    }

}
