package BinarySearch;

public class DistributeChocolate {
    public static boolean idDivision(int [] a, int m, int maxChocAllowed){
        int numberOfStudent = 1;
        int choc = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] > maxChocAllowed) {
                return false;
            }
            if (choc + a[i] <= maxChocAllowed) {
                choc += a[i];
            } else {
                numberOfStudent++;
                choc = a[i];
            }
            if (numberOfStudent > m) {
                return false;
            }
        }
            return true;

    }
    public static int distChoc(int [] a, int m){
        int ans = 0;
        int st = 1, end = (int) 1e9;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if (idDivision(a, m, mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] a = {12,34,67,90};
        int m = 2;
        System.out.println(distChoc(a,m));
    }
}
