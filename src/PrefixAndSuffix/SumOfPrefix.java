package PrefixAndSuffix;

import java.util.Scanner;

public class SumOfPrefix {
    public static int[] PrefixSum(int [] a){
        int n = a.length;
        int [] prefix = new int[a.length];
        int pref = 0;
        for (int i=0;i<n;i++){
            pref = pref+a[i];
            prefix[i] = pref;
        }
        return prefix;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int [] ans = PrefixSum(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }


    }
}
