package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static int palindromeNum(int n , int reverse) {
        if (n == 0) {
            return reverse;
        }
        int digit = n % 10;
        reverse = reverse * 10 + digit;

        return   palindromeNum(n / 10, reverse);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        int reverse = 0;
        int pal = palindromeNum(n,reverse);
        if (n == pal){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This not Palindrome");
        }

    }
}
