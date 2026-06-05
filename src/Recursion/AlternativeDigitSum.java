package Recursion;

import java.util.Scanner;

public class AlternativeDigitSum {
    public static int alternativeSum(int n, boolean add){
        if (n == 0){
            return 0;
        }
        int digit = n % 10;
        if (add) {

            return alternativeSum(n / 10 , false) + digit;
        }

        return alternativeSum(n/10,true)- digit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit : ");
        int n = sc.nextInt();
        System.out.println(alternativeSum(n,true));
    }
}
