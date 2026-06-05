package PrefixAndSuffix;

public class MaximumPrefixSum {
    public static int MaximumSum(int [] a){
        int n = a.length;
        int MaxPrefSum = 0;
        int[] ans = new int[n];
        int PefSum = 0;
        for (int i = 0;i<n;i++){
            PefSum = PefSum + a[i];
            if (PefSum>MaxPrefSum){
                MaxPrefSum = PefSum;
            }

        }

        return MaxPrefSum;
    }
    public static void main(String[] args){
        int [] a = {2,-1,3,-2,4};
        System.out.println(MaximumSum(a));

    }
}
