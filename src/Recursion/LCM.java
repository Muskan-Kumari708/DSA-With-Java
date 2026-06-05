package Recursion;

import java.util.Scanner;

public class LCM {
    public static int lcm(int x, int y){
        if (y == 0){
            return x;
        }
        return lcm(y, x % y);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x : ");
        int x = sc.nextInt();
        System.out.println("Enter the y : ");
        int y = sc.nextInt();
        int val = lcm(x, y);
        int Lcm = x * y/val;
        System.out.println(Lcm);
    }
}
