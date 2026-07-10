package Arrays;

public class ThreePartitionArray {
    public static boolean partition(int [] a){
        int n = a.length;
        int sumOfArray = 0;
        for (int i=0;i<n;i++){
            sumOfArray += a[i];
        }
        if (sumOfArray%3 != 0){
            return false;
        }
        int target = sumOfArray/3;
        int sum = 0;
        int count = 0;
        for (int i=0;i<n;i++){
             sum = sum+a[i];
            if (sum == target){
                count++;
                sum = 0;

            }
        }
        if (count >= 3){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int [] a = {0,2,1,-6,6,7,9,-1,2,0,1};
        System.out.println(partition(a));

    }
}
