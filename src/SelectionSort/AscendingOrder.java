package SelectionSort;

public class AscendingOrder {
    public static void printOrder(int [] a){
        int n = a.length;
        for (int i =0;i < n-1;i++){
            int min_idx = i;
            for (int j = i+1; j < n;j++){
                if (a[j] < a[min_idx]){
                    min_idx = j;
                }
            }
            int t = a[i];
            a[i] = a[min_idx];
            a[min_idx] = t;
        }
        for (int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int [] a = {7,5,4,3,1};
        printOrder(a);
    }
}
