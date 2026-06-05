package toPointers;

import java.util.Scanner;

public class K_RotateArray {
    public static int[] rotate(int [] arr , int k){
        int [] ans = new int[arr.length];
        int pos = 0;
        int n = arr.length;
        k = k % n;
        for (int i = n-k;i<n;i++){
            ans[pos] = arr[i];
            pos++;
        }
        for (int i=0;i<n-k;i++){
            ans[pos] = arr[i];
            pos++;
        }
        return ans;
    }
    public static void main(String[] args){
        int []  arr = {1,2,3,4,5};
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        int [] ans = rotate(arr,k);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }

    }
}
