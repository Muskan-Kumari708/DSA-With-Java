package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNum(int n , int reverse){
        // Base case
        if (n == 0 ){
            return reverse;
        }
        // Subproblem

        int digit = n % 10;
        reverse = reverse * 10 + digit;

        return  reverseNum(n/10 , reverse)  ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        int reverse = 0;
        System.out.println(reverseNum(n , reverse));



    }
}
