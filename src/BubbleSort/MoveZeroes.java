package BubbleSort;

public class MoveZeroes {
    public static void setZeroes(int [] a){
        for (int i = 0;i<a.length-1;i++){
            for (int j = 0;j<a.length-i-1;j++){
                if (a[j] ==0 && a[j+1] != 0){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int [] a = {0,1,0,3,0,12};
        setZeroes(a);
    }
}
