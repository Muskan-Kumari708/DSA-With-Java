package Arrays;

import java.util.Scanner;

public class missing_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();




        int[] a1 = {1,3,4,5};
        int sum = 0;

        for (int i=0;i<a1.length;i++){
           sum = sum+a1[i] ;
        }
        int missing = (n*(n+1)/2)-sum;
        System.out.println("Missing number is :" + missing);


    }

}
