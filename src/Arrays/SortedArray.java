package Arrays;

public class SortedArray {
    public static boolean sorted(int [] a){
        boolean isSorted = false;
        for (int i=0;i<a.length-1;i++){
            if (a[i] <= a[i+1]){
                isSorted = true;
            }
            else {
                isSorted = false;
                break;
            }
        }
        return isSorted;

    }
    public static void main(String[] args){
        int [] a = {1,2,3,4};
        System.out.println(sorted(a));

    }
}
