package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        int digit = n%10;
        return sum(n/10) + digit ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }

}
