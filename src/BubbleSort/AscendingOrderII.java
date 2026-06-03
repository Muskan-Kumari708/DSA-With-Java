package BubbleSort;

public class AscendingOrderII {
    public static void bubbleSort(int [] a){
        for (int i =0;i<a.length-1;i++){
            boolean flag = false;
            for (int j = 0; j<a.length-i-1;j++){
                if (a[j] > a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                    flag = true;
                }
            }
            if (flag == false){
                return;
            }

        }
    }
   public static void main(String[] args){
        int [] a = {1,5,2,4};
        bubbleSort(a);
   }
}
