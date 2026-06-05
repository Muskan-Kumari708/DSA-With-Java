package Recursion;

import java.util.Scanner;

public class KMultiple {
    public static int kMultiple(int n , int k){
        // Base case
        if (k == 0){
            return 1;
        }
        // Subproblem
        return n * kMultiple(n , (k-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        System.out.println(kMultiple(n,k));
    }
}
