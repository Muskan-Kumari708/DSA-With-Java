package Arrays_2D;

import java.util.Scanner;

public class Boundary_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        } for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i==0 || i==2 || j==0 || j==2){
                    System.out.print(arr[i][j]);
                }
            }

        }






    }
}
