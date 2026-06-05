package PrefixAndSuffix;

import java.util.Scanner;

public class SuffixSum {
    public static int[]  suffixSum(int [] a) {
        int n = a.length;
        int [] suff = new int[n];

        int sum = 0;
        for (int i = a.length-1;i>=0;i--){
            sum = sum + a[i];
            suff[i] = sum;
        }
       return suff;
    }
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int [] ans = suffixSum(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }
    }
}
