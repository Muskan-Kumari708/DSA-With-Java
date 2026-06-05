package BubbleSort;

import java.util.Arrays;

public class RelativeSortArray {
    public static void relativeSort(int [] arr1, int [] arr2){
        for (int i = 0;i<arr2.length;i++){
            for (int j = 0;j<arr1.length;j++){
                if (arr1[j] == arr2[i]){
                    System.out.print(arr1[j]+" ");
                    arr1[j] = -1;
                }
            }

        }
        // for sort remaining array
        Arrays.sort(arr1);

        for (int i=0;i<arr1.length;i++){
            if (arr1[i] != -1){
                System.out.print(arr1[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int [] arr1 = {2,3,1,3,2,4,7,6,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        relativeSort(arr1,arr2);
    }
}
