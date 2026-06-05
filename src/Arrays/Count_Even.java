package Arrays;

import java.util.Scanner;

public class Count_Even {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int [] countEven = new int[n];
        for (int i=0;i<n;i++){
            countEven[i] = sc.nextInt();
        }
        for (int j=0;j<n;j++){
            if (countEven[j]%2==0){
                count = count+1;

            }


        }
        System.out.println("Even number"+count);
    }
}
