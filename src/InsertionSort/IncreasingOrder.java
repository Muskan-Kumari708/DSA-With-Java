package InsertionSort;

public class IncreasingOrder {
    public static void  printOrder(int [] a){
        for (int i=0;i<a.length;i++){
            int j = i;
            while (j>0 && a[j] < a[j-1]){
                int t = a[j-1];
                a[j-1] = a[j];
                a[j] = t;
                j--;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int [] a = {8,3,6,2,4};
        printOrder(a);
    }
}
