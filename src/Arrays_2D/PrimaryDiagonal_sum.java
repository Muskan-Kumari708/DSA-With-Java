package Arrays_2D;

import java.util.Scanner;

public class PrimaryDiagonal_sum {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] dia = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                dia[i][j] = sc.nextInt();
            }
        } for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(dia[i][j]);
            }
            System.out.println();
        }
        int sum =0;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i==j){
                    sum= sum+dia[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal element:"+sum);


    }
}
