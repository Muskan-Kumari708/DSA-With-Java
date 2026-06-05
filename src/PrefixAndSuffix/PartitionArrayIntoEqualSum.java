package PrefixAndSuffix;

public class PartitionArrayIntoEqualSum {
    public static boolean EqualSubset(int [] a){
        int n = a.length;
        int TotalSum = 0;
        for (int i = 0;i<n;i++){
            TotalSum = TotalSum + a[i];
        }
        int ans = TotalSum / 2;
        for (int i=0;i<n;i++){
            int sum = 0;
            for (int j = i;j<n;j++){
                sum = sum + a[j];
                if (sum == ans){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] a = {1,5,11,5};
        System.out.println(EqualSubset(a));

    }

}
