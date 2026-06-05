package PrefixAndSuffix;

import java.util.Arrays;
import java.util.Scanner;

public class Partition {
    public static boolean SuffixAndPrefixSum(int[] a) {
        int n = a.length;
        int Totalsum = 0;
        for (int i = 0; i < n; i++) {
            Totalsum = Totalsum + a[i];
        }
        int PrefixSum = 0;
        for (int i = 0; i < n; i++) {
            PrefixSum = PrefixSum + a[i];

            int SuffixSum = Totalsum - PrefixSum;
            if (PrefixSum == SuffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :  ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0;i< a.length;i++){
            a[i] = sc.nextInt();;
        }
        Arrays.sort(a);
        System.out.println(SuffixAndPrefixSum(a));

    }
}

