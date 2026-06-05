package Arrays;

import java.util.Scanner;

public class MinEleInRotatedStoredArray {
    public static void rotated(int [] a, int k){
        int [] ans = new int[a.length];
        int n = a.length;
        k = k % n;
        int pos = 0;
        for (int i=n-k;i < n;i++){
            ans[pos] = a[i];
            pos++;
        }
        for (int i = 0;i<n-k;i++){
            ans[pos] = a[i];
            pos++;
        }

        // print  array

        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        // for minium
        int minIndex = 0;
        for (int i=1;i<ans.length;i++){
            if (ans[i] < ans[minIndex]){
                minIndex = i;

            }
        }
        if (minIndex == k){
            System.out.println("correct");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        rotated(a,k);

    }
}
