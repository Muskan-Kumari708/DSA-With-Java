import java.util.Scanner;

public class Function {
    public static int pailimdrom(int num , int rev){
        int x =num;
        while (num>0) {
            int digit = num % 10;
            rev = rev*10+digit;
            num = num/10;



        }
        System.out.println(rev);
        if (x==rev){
            System.out.println("pailimdrom");
        }
        else {
            System.out.println("Thankyou");
        }

        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
//        int b= sc.nextInt();
        int rev = 0;

        pailimdrom(num,rev);


    }
}
