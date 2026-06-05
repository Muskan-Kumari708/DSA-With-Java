package PrefixAndSuffix;

public class PrefixAndSuffixDifference {
    public static int [] PrefSuffixDifference(int [] a){
        int n = a.length;
        int PrefSum = 0;
        int TotalSum = 0;
        int [] ans = new int[n];
        for (int i =0;i<n;i++){
            TotalSum = TotalSum + a[i];
        }
        for (int i = 0;i<n;i++){
            PrefSum = PrefSum + a[i];
            int SuffixSum = TotalSum - PrefSum + a[i];
            int Difference = Math.abs(PrefSum - SuffixSum);
            ans[i] = Difference;
        }
        return ans;
    }
    public static void main(String[] args){
        int [] a = {10,4,8,3};
        int [] nums = PrefSuffixDifference(a);
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

    }
}
