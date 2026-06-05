package PrefixAndSuffix;

public class SubarraySumEqual_K {
    public static int  subarray(int [] a,int k){
        int count = 0;
        int n = a.length;
        for (int i=0;i<a.length;i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args){
        int [] a = {1,-1,1,-1,1};
        int k = 0;

        System.out.println(subarray(a,k));
    }
}
