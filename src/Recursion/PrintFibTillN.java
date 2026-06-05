package Recursion;

import java.util.Scanner;

public class PrintFibTillN {
    public static void printFibonacci(int n, int a , int b){
        // Base  case
        if (n<1){
            return;
        }

        // Subproblem
        printFibonacci(n-1,b,a+b);
        System.out.print(a+" ");


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number : ");
        int n = sc.nextInt();
        printFibonacci(n, 0,1);
    }
}
