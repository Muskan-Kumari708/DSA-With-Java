package Recursion;

public class MaxValueInArray {
    public static int maxValue(int[] arr , int idx){
        if (idx == arr.length-1){
            return idx;
        }
        int smallAns = maxValue(arr, idx+1);
        return Math.max(arr[idx] , smallAns);

    }
    public static void main(String[] args){
        int [] arr = {13,10,3,2,5};
        System.out.println(maxValue(arr,0));

    }
}
