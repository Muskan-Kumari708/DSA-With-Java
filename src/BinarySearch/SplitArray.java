package BinarySearch;

public class SplitArray {
    public static boolean subSplit(int [] a, int k, int mid){
        int numberOfSplit = 1;
        int SplitNumber = 0;
        for (int i=0;i<a.length;i++){
            if (a[i] > mid){
                return false;
            }
            if (SplitNumber+a[i] <= mid){
                SplitNumber += a[i];
            }
            else{
                numberOfSplit++;
                SplitNumber = a[i];
            }
        }
        if (numberOfSplit > k){
            return false;
        }
        return true;
    }
    public static int splitArray(int [] a, int k){
        int ans = -1;
        int st = 1, end = (int) 1e9;
        while (st<=end){
            int mid = st+(end-st)/2;
            if (subSplit(a,k,mid)){
                ans = mid;
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] a = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(a,k));
    }
}
