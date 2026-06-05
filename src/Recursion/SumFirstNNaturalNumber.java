package Recursion;

import java.util.Scanner;

public class SumFirstNNaturalNumber {
    public static int sumNaturalNumber(int n){
        if (n == 1){
            return 1;
        }
        int sum = sumNaturalNumber(n-1) + n;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        System.out.println(sumNaturalNumber(n));
    }
}
