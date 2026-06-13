package SortingProblem;

public class TwoSwapped {
    public static void sortArray(int [] arr){
        int x = -1, y = -1;
        for (int i=1;i< arr.length;i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

            //swape

            int t = arr[x];
            arr[x] = arr[y];
            arr[y] = t;



        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int [] arr = {3,8,6,7,5,9,10};
        sortArray(arr);

    }
}
