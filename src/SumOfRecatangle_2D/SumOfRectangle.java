package SumOfRecatangle_2D;

import java.util.Scanner;

public class SumOfRectangle {
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

//        Brute Force

        int sum = 0;
        for (int i = l1;i <= l2; i++){
            for (int j = r1;j <= r2; j++){
                sum = sum + rec[i][j];
            }
        }
        System.out.println("Sum Of Rectangle is : " + sum);
    }
}
