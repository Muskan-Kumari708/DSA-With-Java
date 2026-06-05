package SelectionSort;

import java.util.Arrays;

public class PrintEveryPass {
    public static void printArray(int [] a){
        int n = a.length;
        for (int i=0;i<n-1;i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }

            }
            int t = a[i];
            a[i] = a[min_idx];
            a[min_idx] = t;
            System.out.println(Arrays.toString(a));
        }
    }
    public static void main(String[] args){
        int [] a = {7,5,4,1,3};
        printArray(a);

    }
}
