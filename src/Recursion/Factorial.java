package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fac(int n){
        if (n == 1){
            return 1;
        }
        int f = fac(n-1) * n;
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
}
