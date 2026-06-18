package BinarySearch;

public class FindTarget {
    public static boolean findTarget(int [] a, int target){
        int st = 0, end = a.length-1;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (target == a[mid]){
                    return true;
            } else if (target > a[mid]) {
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] a = {5,6,7,8,9,10};
        int target = 10;
        System.out.println(findTarget(a,target));
    }
}
