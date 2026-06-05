package Function_Ex_question;

import java.util.Scanner;

public class Strong_Num {
    public static int strong(int num , int sum){
        int n = num;
        while (num>0){
            int digit = num%10;
            int fac=1;
            for (int i=1;i<=digit;i++){
                fac = fac*i;
            }
            sum = sum+fac;
            num = num/10;
        }
        if (n==sum){
            System.out.println("It is Strong Number:"+ sum);
        }
        else {
            System.out.println("It is not a Strong Number");
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int sum = 0;
        strong(num,sum);
    }
}
