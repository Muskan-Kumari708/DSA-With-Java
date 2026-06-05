package Function_Ex_question;

import java.util.Scanner;

public class Greatest_common_div {
    public static int Common(int a , int b ){
        if (a<b){
            for (int i=1;i<=a;i++){
                if (a%i==0 && b%i==0){
                    System.out.println(i);

                }
            }


        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Common(a,b);
    }
}
