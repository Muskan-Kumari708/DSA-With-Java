package BinarySearch;

public class CapacityToShip {
    public static boolean capacity(int [] a, int day, int maxWeight){
        int shipCapacity = 1;
        int weightNumber = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] > maxWeight) {
                return false;
            }
            if (weightNumber + a[i] <= maxWeight) {
                weightNumber += a[i];
            } else {
                shipCapacity++;
                weightNumber = a[i];
            }
            if (shipCapacity > day) {
                return false;
            }
        }
        return true;

    }
    public static int shipWithinDays(int [] a, int day){
        int ans = 0;
        int st = 1, end = (int) 1e9;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if (capacity(a, day, mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int day = 5;
        System.out.println(shipWithinDays(a, day));
    }
}
