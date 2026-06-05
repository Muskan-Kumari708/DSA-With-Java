package PrefixAndSuffix;

import java.util.Scanner;

public class LeftSumEqualsRightSum {
    public static int LeftSumRightSum(int [] a){
        int n = a.length;
        int TotalSum = 0;
        for (int i = 0;i<n;i++){
            TotalSum = TotalSum+a[i];
        }
        int PrefixSum = 0;
        for (int i=0;i<n;i++){
            PrefixSum = PrefixSum + a[i];
            int SuffixSum = TotalSum - PrefixSum;
            if (PrefixSum-a[i] == SuffixSum){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(LeftSumRightSum(a));

    }
}
