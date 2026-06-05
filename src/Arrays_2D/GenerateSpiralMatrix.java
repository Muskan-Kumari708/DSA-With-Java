package Arrays_2D;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    public static void GenerateSpiralMatrix(int [][] matrix , int r , int c){

        for (int i=0;i<r;i++){
            for (int j =0;j<c;j++){
                System.out.print(matrix[i][j]);
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the col : ");
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];

        // Toprow = Leftcol -> Rightcol;
//         Rightcol = Toprow -> Bottomrow;
//         Leftcol = Bottomrow -> Toprow;
//         Bottomrow = Rightcol -> Leftcol;

        int Leftcol = 0;
        int Rightcol = c-1;
        int Toprow = 0;
        int Bottomrow = r-1;

        int num = 1;

        int TotalMatrix = 0;
        while (TotalMatrix <= r*c) {

            // For TopRow

            for (int j = Leftcol; j <= Rightcol && TotalMatrix <= r*c; j++) {
                matrix[Toprow][j] = num++;   // postfix increment

            }

            Toprow++;
            TotalMatrix++;

            // For RightCol

            for (int i = Toprow; i <= Bottomrow && TotalMatrix <= r*c; i++) {
                matrix[i][Rightcol] = num++;   // postfix increment

            }

            Rightcol--;
            TotalMatrix++;

            // For  Bottomrow

            for (int j = Rightcol; j >= Leftcol && TotalMatrix <= r*c; j--) {
                matrix[Bottomrow][j] = num++;   // postfix increment

            }

            Bottomrow--;
            TotalMatrix++;

            // For Leftcol

            for (int i = Bottomrow; i >= Toprow && TotalMatrix <= r*c; i--) {
                matrix[i][Leftcol] = num++;   // postfix increment

            }

            Leftcol++;
            TotalMatrix++;
        }
        GenerateSpiralMatrix(matrix,r,c);


    }
}
