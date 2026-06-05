package Function_Ex_question;

import java.util.Scanner;

public class Fibonacci_Series {
    public static int fib(int n){
        int a=0;
        int b=1;
        System.out.print(a +" ");
        System.out.print(b+" " );
        for (int i=3;i<=n;i++) {
            int c = a + b;


            System.out.print(c+" " );

            a = b;
            b = c;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       fib(n);
    }
}
