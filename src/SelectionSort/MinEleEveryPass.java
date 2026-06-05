package SelectionSort;

public class MinEleEveryPass {
    public static void printElement(int [] a){
        int n = a.length;
        for (int i=0;i<n-1;i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }

            }
            System.out.println(a[min_idx]);


            int t = a[i];
            a[i] = a[min_idx];
            a[min_idx] = t;
        }
    }
    public static void main(String[] args){
        int [] a = {7,5,4,1,3};
        printElement(a);
    }
}
