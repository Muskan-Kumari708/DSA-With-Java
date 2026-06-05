package Recursion;

import java.util.Scanner;

public class SumOfSquare {
    public static int squareSum(int n){
        if (n == 0){
            return 0;
        }
        return squareSum(n-1) + n*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number : ");
        int n = sc.nextInt();
        System.out.println(squareSum(n));
    }
}
