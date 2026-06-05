package Recursion;

import java.util.Scanner;

public class PowerTwo {
    public static void powerTwo(int n){
        if (n == 1){
            System.out.println("YES");
        }

        if (n % 2 == 0){
            powerTwo(n/2);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        powerTwo(n);

    }
}
