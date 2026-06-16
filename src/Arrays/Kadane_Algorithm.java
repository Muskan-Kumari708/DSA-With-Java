package Arrays;

public class Kadane_Algorithm {
    public static int maxSum(int [] a){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i=0;i<a.length;i++){
            currSum = currSum + a[i];
            maxSum = Integer.max(maxSum,currSum);

            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int [] a = {2,-3,4,1};
        System.out.println(maxSum(a));
    }
}
