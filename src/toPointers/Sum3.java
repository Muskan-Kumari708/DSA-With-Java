package toPointers;

import java.util.Arrays;
import java.util.Scanner;

public class Sum3 {
    public static void sumIII(int [] a){
        int n = a.length;
        for (int i = 0 ;i<n;i++){
            int left = i+1;
            int right = n-1;
            while (left<right){
                int sum = a[left] +a[right]+a[i];
                if (sum==0){
                    System.out.println(a[left]+" "+a[right]+" "+a[i]);
                    left++;
                    right--;

                } else if (sum>0) {

                    right--;
                }
                else{
                    left++;
                }
            }
        }
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        sumIII(a);

    }
}
