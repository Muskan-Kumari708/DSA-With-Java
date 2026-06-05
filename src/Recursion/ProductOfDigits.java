package Recursion;

import java.util.Scanner;

public class ProductOfDigits {
    public static int product(int n){
        if (n == 0){
            return 1;
        }
        int digit = n % 10;
        return product(n/10) * digit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number : ");
        int n = sc.nextInt();
        System.out.println(product(n));
    }
}
