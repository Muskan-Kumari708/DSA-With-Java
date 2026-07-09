package BinarySearch;

public class RacingTrack {
    public static boolean isPossible(int [] a, int k , int mid) {
        int kidsPlace = 1;
        int lastKid = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]-lastKid >= mid){
                kidsPlace++;
                lastKid = a[i];
            }
        }
       if (kidsPlace >= k){
           return true;
       }
       return false;
    }
    public static int raceTrack(int [] a, int k){
        int ans = -1;
        int st = 1, end = (int) 1e9;
        while (st<=end){
            int mid = st + (end-st)/2;
            if (isPossible(a,k,mid)){
                ans = mid;
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] a = {1,2,4,8,9};
        int k = 3; // k represent number of kids
        System.out.println(raceTrack(a,k));
    }
}
