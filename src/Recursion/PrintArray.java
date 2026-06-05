package Recursion;

public class PrintArray {
    public static void printArray(int [] arr , int idx){
        int n = arr.length;

        if (idx == n ){
            return;
        }
        System.out.println(arr[idx]);

        printArray(arr, idx+1);

    }
    public static void main(String[] args){
        int [] a = {5,6,7,8,9};
        printArray(a,0);

    }
}
