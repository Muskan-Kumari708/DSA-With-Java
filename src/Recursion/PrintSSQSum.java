package Recursion;

public class PrintSSQSum {
    public static void printSSQ(int [] a, int idx, int sum){
        if (idx == a.length){
            System.out.println(sum);
            return;
        }
        printSSQ(a,idx+1,sum);
        printSSQ(a, idx+1,sum + a[idx]);
    }
    public static void main(String[] args){
        int [] a = {2,4,5};
        int  sum = 0;
        printSSQ(a,0,sum);
    }
}
