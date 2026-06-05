package Recursion;

import java.util.Scanner;

public class TableOfNumber {
    public static void printTable(int n , int i){
        if (i == 0){
            return;
        }
        printTable(n,i-1);
        System.out.println(n*i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int n = sc.nextInt();
        int i = 10;
       printTable(n,i);
    }
}
