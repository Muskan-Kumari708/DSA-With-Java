package SelectionSort;

import java.util.Arrays;

public class SortHalfArray {
    public static void sortArray(int [] a){
        int n = a.length;
        for (int i=0;i<n-1/2;i++) {
            int min_idx = i;
            for (int j = i + 1; j < n/2; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }

            }
            int t = a[i];
            a[i] = a[min_idx];
            a[min_idx] = t;
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        int [] a = {7,5,4,1,9,3};
        sortArray(a);
    }

}
