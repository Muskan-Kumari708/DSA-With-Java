package Recursion;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int n , int i){
        // Base case
        if (n <= 1){
            return false;
        }
        if (i * i > n){
            return true;
        }
        // Subproblem
        if (n % i == 0){
            return false;
        }
        return prime(n,i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 2;
        if (prime(n,i)){
            System.out.println("This is Prime Number");
        }
        else {
            System.out.println("This is not prime number");
        }
    }
}
