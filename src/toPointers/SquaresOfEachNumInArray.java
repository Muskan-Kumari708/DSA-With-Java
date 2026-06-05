package toPointers;

import java.util.Scanner;

public class SquaresOfEachNumInArray {
    public static int [] squareEach(int [] a){
        int [] arr = new int[a.length];
        for (int i=0;i<a.length;i++){
            arr[i]=a[i]*a[i];
        }

        int n = arr.length;
        int [] ans = new int[arr.length];

        int i = n-1;
        int left = 0;
        int right = n-1;
        while (left <= right){
            if (arr[left] > arr[right]){
                ans[i] = arr[left];
                left++;
                i--;

            }
            else {
                ans[i] =arr[right];
                right--;
                i--;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int [] ans = squareEach(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }


    }
}
