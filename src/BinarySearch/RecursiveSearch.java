package BinarySearch;

public class RecursiveSearch {
    public static boolean findEle(int [] a, int target, int st,int end){
        if (st > end){
            return false;
        }
        int mid = st + (end-st)/2;
        if (target == a[mid]){
            return true;
        } else if (target > a[mid]) {
             return findEle(a, target, mid+1,end );

        }
        else {
            return findEle(a,target,st,mid-1);
        }
    }
    public static void main(String[] args){
        int [] a = {5,8,10,13,15};
        int target = 10;
        System.out.println(findEle(a,target,0,a.length-1));

    }
}
