package Function_Ex_question;

import java.util.Scanner;

public class powerNumber {
    public static int number(int x, int n, int number){
        for (int i=1; i<=n ;i++) {
            number = number * x;
        }
            System.out.println(number);

        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int number = 1;
        number(x,n ,number);

    }
}
