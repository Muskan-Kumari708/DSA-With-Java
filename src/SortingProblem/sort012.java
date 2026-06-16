package SortingProblem;

public class sort012 {

        static void swap(int[] a, int x, int y){
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
        }
        static void sort(int[] a){
            int lo = 0, mid = 0, hi = a.length-1;
            while(mid <= hi){
                if(a[mid] == 0){
                    swap(a, mid, lo);
                    mid++;
                    lo++;
                } else if(a[mid] == 1){
                    mid++;
                } else {
                    swap(a, mid, hi);
                    hi--;
                }
            }
        }

    public static void main(String[] args){
        int [] a = {0,2,1,2,0,0};
        sort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
