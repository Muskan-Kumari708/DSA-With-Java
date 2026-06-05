package toPointers;

import java.util.Scanner;

public class Sort0sand1s {
    public static int [] sort(int [] a){
        int n = a.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (a[left]==1 && a[right]==0){
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
                right--;
            } else if (a[right]==1) {
                right--;
            }
            else {
                left++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int [] ans = sort(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i] + "\t" );
        }
    }
}
