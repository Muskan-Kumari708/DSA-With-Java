package Arrays;

public class Copy_Array {
    public static  void main(String[] args) {
        int[] a = new int[5];
        int[] arr = {5, 7, 9, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        //print the array , a[i] :-
        for (int j=0;j<5;j++){
            System.out.print(a[j]);
        }

    }





}
