package Recursion;

import java.util.Scanner;

public class Print1toN {
    public static void printIncreasing(int n){
        if (n == 0){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        printIncreasing(n);

    }
}
