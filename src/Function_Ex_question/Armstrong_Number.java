package Function_Ex_question;

import java.util.Scanner;

public class Armstrong_Number {
    public static int Armstrong(int num , int sum ,int count){
        int x = num;
        int store = x;

        while (num>0){
            int digit =  num%10;
            count = count+1;
            num = num/10;
        }
        while (x>0) {
            int  digit = x % 10;
            int number=1;
            for (int i = 1; i <= count; i++) {
                number = number * digit;
            }
            sum = sum+number;
            x = x/10;


        }
        if (sum==store){
            System.out.println("It is Armstrong Number"+sum);
        }
        else {
            System.out.println("It is not Armstrong Number");
        }

        return 0;

    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        Armstrong(num,sum,count);

    }
}
