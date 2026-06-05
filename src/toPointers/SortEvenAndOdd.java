package toPointers;

import java.util.Scanner;

public class SortEvenAndOdd {
    public static int [] EvenOdd(int [] a){
        int n = a.length;

        int left = 0;
        int right = n-1;

        while (left < right){
            if (a[left]%2 != 0 && a[right]%2 == 0){
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
            } else if (a[right]%2 != 0) {
                right--;

            }
            else {
                left++;
            }

        }
        return a;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int [] ans = EvenOdd(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }

    }
}
