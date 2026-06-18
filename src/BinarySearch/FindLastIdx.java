package BinarySearch;

public class FindLastIdx {
    public static int firstIndex(int [] a, int x){
        int st = 0, end = a.length-1;
        int fIdx = -1;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (x == a[mid]){
                fIdx = mid;
                st = mid+1;
            } else if (x > a[mid]) {
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return fIdx;
    }
    public static void main(String[] args){
        int [] a = {2,2,5,5,5,6,6,8,9,9,9};
        int x = 5;
        System.out.println(firstIndex(a,x));
    }
}
