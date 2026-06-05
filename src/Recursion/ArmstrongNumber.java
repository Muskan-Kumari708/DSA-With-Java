package Recursion;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int countDigits(int n){
        if (n==0){
            return 0;
        }
        return countDigits(n/10) + 1;
    }

    public static int armstrongNum(int n, int count ){

        if (n == 0){
            return 0;
        }
        int digit = n % 10;
         return  armstrongNum(n/10 , count) + (int) Math.pow(digit, count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number : ");
        int n = sc.nextInt();
        int count = countDigits(n);
        int result = armstrongNum(n, count);
        if (result == n){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }

    }
}
