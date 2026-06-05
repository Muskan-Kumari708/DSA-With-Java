package Recursion;

import java.util.Scanner;

public class Power {
    public static int powerOfNumber(int a, int b){
        if ( b == 0){
            return 1;
        }
        return a * powerOfNumber(a, b-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        System.out.println("enter the power : ");
        int b = sc.nextInt();
        System.out.println("final result is : " + powerOfNumber(a,b));
    }
}
