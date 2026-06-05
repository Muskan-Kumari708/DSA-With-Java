package BubbleSort;

public class AscendingOrder {
    public static void bubbleSort(int [] a){
        for (int i =0;i<a.length-1;i++){
            for (int j = 0; j<a.length-i-1;j++){
                if (a[j] > a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }

        }
        for (int i= 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        int [] a = {3,1,2,7,5};
        bubbleSort(a);

    }
}
