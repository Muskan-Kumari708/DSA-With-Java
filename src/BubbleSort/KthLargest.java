package BubbleSort;

import java.util.Arrays;

public class KthLargest {
    public static void kthLargest(int [] a, int k){
        for (int i=0;i<k;i++){
            for (int j = 0;j < a.length-i-1 ;j++){
                if (a[j] > a[j+1]) {
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println(a[a.length-k]);
    }
    public static void main(String[] args){
        int [] a = {7,2,9,4,1};
        int k = 2;
        kthLargest(a,k);

    }
}
