package BinarySearch;

public class InsertPosition {
    public static int position(int [] a, int target){
        int st = 0, end = a.length-1;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (target == a[mid]){
                return mid;
            }
            else if (target > a[mid]){
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return st;
    }
    public static void main(String[] args){
        int [] a = {1,3,5,6};
        int target = 7;
        System.out.println(position(a,target));
    }
}
