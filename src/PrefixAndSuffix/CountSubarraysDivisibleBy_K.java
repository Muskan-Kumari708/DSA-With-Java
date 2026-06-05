package PrefixAndSuffix;

public class CountSubarraysDivisibleBy_K {
    public static int SubarraysDivision(int [] a ,int k){
        int n = a.length;
        int count = 0;
        for (int i = 0;i<n;i++){
            int sum = 0;
            for (int j = i ;j<n;j++){
                sum = sum + a[j];

                if (sum % k == 0){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args){
        int [] a = {1,2,3};
        int k = 3;
        int ans = SubarraysDivision(a,k);
        System.out.println(ans);

    }
}
