package AdvanceSortingAlgo;

public class CountSort {
    public static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                arr[i] = max;

            }
        }
        return max;
    }
    public static void basicCountSort(int [] arr){
        int max = findMax(arr);
        int [] count = new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int k =0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k] = i;
                k++;
            }
        }
    }
    public static void countSort(int [] arr){
        int n=arr.length;
        int [] output = new int [n];
        int max = findMax(arr);
        int [] count = new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for (int i=1;i< arr.length;i++){
            count[i] += count[i-1];
        }

        for (int i=n-1;i>0;i++){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all element of output to arr
        for (int i=0;i<output.length;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args){
        int [] arr = {1,4,5,2,2,5};
        countSort(arr);
    }
}
