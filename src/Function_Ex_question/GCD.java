package Function_Ex_question;

import java.util.Scanner;

public class GCD {
    public static int gcd(int x, int y){
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x : ");
        int x = sc.nextInt();
        System.out.println("Enter the y : ");
        int y = sc.nextInt();
        int val = gcd(x, y);
        System.out.println(val);
    }
}
