package Recursion;

public class SumArray {
    public static int sum(int [] arr , int idx){
        if (idx == arr.length){
            return 0;
        }
        return sum(arr, idx+1) + arr[idx];
    }
    public static void main(String[] args){
        int [] arr = {2,3,5,20,1};
        System.out.println(sum(arr,0));
    }
}
