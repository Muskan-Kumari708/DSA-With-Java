package Recursion;

public class ReverseArray {
    public static int[] reverse(int [] a, int left, int right){
        if (left >= right){
            return a;
        }

        int t = a[left];
        a[left] = a[right];
        a[right] = t;

        reverse(a, left+1, right-1);

        return a;
    }
    public static void main(String[] args){
        int [] a = {2,3,4,5,6};
        int n = a.length-1;
        int [] ans = reverse(a,0, n);
        for (int i=0;i<a.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
