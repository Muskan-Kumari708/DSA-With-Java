package BinarySearch;

public class AllocateMinimumPages {
    public static boolean minimumPages(int [] a, int k, int maxPagesAssigned){
        int numberOfStudent = 1;
        int pageNumber = 0;
        for (int i=0;i<a.length;i++){
            if (a[i] > maxPagesAssigned){
                return false;
            }
            if (pageNumber+a[i] <= maxPagesAssigned){
                pageNumber += a[i];
            }
            else {
                numberOfStudent++;
                pageNumber = a[i];
            }
        }
        if (numberOfStudent > k){
            return false;
        }
        return true;
    }
    public static int findPages(int [] a ,int k){
        int ans = 0;
        int st = 1, end = (int) 1e9;
        while (st<=end){
            int mid = st + (end-st)/2;
            if(minimumPages(a,k,mid)){
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
        int [] a = {12,34,67,90};
        int k = 2;
        System.out.println(findPages(a,k));
    }
}
