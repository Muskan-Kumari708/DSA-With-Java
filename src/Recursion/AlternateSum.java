package Recursion;

import java.util.Scanner;

public class AlternateSum {
    public static int alternateSum(int n){
        // Base case
        if (n == 0){
            return 0;
        }
        // Subproblem
        if (n % 2 ==0){
            return alternateSum(n-1) - n;
        }
        else {
            return alternateSum(n-1) + n;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Alternate Sum is : "+alternateSum(n));

    }
}
