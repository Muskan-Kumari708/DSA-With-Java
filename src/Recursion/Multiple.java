package Recursion;

import java.util.Scanner;

public class Multiple {
    public static int multiple(int a,int b){
        if (b == 0){
            return 0;
        }
        return multiple(a,b-1) + a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a : ");
        int a = sc.nextInt();
        System.out.println("Enter the b : ");
        int b = sc.nextInt();
        System.out.println(multiple(a,b));
    }
}
