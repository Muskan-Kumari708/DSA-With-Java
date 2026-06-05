package Recursion;

import java.util.Scanner;

public class EvenNum {
    public static void printEvenNum(int n){
        // Base case
        if (n==0){
            return;
        }
        // subproblem

        printEvenNum(n-1);

        if (n % 2 == 0){
            System.out.print(" " + n);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        printEvenNum(n);

    }
}
