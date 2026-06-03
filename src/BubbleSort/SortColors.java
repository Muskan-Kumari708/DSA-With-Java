package BubbleSort;

public class SortColors {
    public static void colorsSort(int [] a){
        for (int i = 0;i<a.length-1;i++){
            for (int j = 0;j<a.length-1-i;j++){
                if (a[j] > a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int [] a = {2,0,2,1,1,0};
        colorsSort(a);
    }
}
