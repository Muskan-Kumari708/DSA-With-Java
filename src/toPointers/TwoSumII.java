package toPointers;

import java.util.Scanner;

public class TwoSumII {
    public static void sum(int [] a,int target){
        int n = a.length;

        int left = 0;
        int right = n-1;

        while (left<right){
            int sum = a[left]+a[right];
            if (sum == target){
                System.out.println(left+"\t"+right);
                break;
            } else if (sum>target) {
                right--;
            }
            else {
                left++;
            }
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        sum(a,target);



    }
}
