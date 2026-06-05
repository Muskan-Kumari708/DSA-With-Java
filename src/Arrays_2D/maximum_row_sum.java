package Arrays_2D;

import java.util.Scanner;

public class maximum_row_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] a = new int[2][3];
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();

        }
        int max = 0;
        int row = 0;
        for (int i=0;i<2;i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
            if (sum > max) {
                max = sum;
                row = i;
            }
        }
        System.out.println("maximum " + row + " Sum is:" + max);
    }
}
