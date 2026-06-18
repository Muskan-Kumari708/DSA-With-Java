package BinarySearch;

public class DescendingSorted {
    public static boolean findTarget(int [] a, int target){
        int st = 0, end = a.length-1;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (target == a[mid]){
                return true;
            } else if (target > a[mid]) {

                end = mid-1;
            }
            else {
                st = mid+1;

            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] a = {15,13 ,10,3};
        int target = 10;
        System.out.println(findTarget(a,target));
    }
}
