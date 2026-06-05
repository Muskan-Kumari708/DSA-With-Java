package Function_Ex_question;

import java.util.Scanner;

public class CountNumber {
    public static void countnum(int count , int number){


            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number");
                int n = sc.nextInt();
            if (n>0) {
                count = count + 1;
                System.out.println("Total +ve Number" + count);
            } else if (n<0) {
                number = number + 1;
                System.out.println("Total -ve Number"+ number);

            }
            else {
                System.out.println("Number is Zero");
            }
            }

    }
    public static void main(String[] args){

        int count = 0;
        int number = 0;
        countnum(count,number);


    }
}
