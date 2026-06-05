package Arrays;

public class PivotIndex {
    public static int pivotindex(int [] a){
        int arrsum = 0;
        for (int i=0;i<a.length;i++){
            arrsum = arrsum + a[i];
        }
        int leftsum = 0;
        for (int i=0;i<a.length;i++){
            if (arrsum-leftsum-a[i] == leftsum){
                return i;

            }
            leftsum = leftsum+a[i];
        }
        return -1;
    }

    public static void main(String[] args){
        int [] a = {1,2,1};
        System.out.println(pivotindex(a));

    }
}
