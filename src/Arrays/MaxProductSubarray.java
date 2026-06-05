package Arrays;

import java.util.Scanner;

public class MaxProductSubarray {
    public static int maxProduct(int [] a){
        int n = a.length;
        int maxValues = Integer.MAX_VALUE;
        int store = 0;
        for (int i=0;i<n;i++){
            for (int j = i;j<n;j++){
                int product = a[i] * a[j];
                System.out.println(product);
            }
        }
        return store;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maxProduct(a));
    }
}
