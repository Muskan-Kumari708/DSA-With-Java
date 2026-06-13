package SortingProblem;

public class SortArray {
    public static void swape(int [] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void partition(int [] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for (int i=st+1;i<end;i++){
            if (arr[i] < pivot){
                count++;
            }
        }
        int pivotIdx = st + count;
       swape(arr, st, pivotIdx);
       int i = st;
       int j = end;

       while (i < j){
           while (arr[i] < 0){
               i++;
           }
           while (arr[j] >= 0){
               j--;
           }
           if (i<j){
               swape(arr, i, j);
               i++;
               j--;
           }
       }
    }
    public static void main(String[] args){
        int [] arr = {19,-20,7,-4,-13,11,-5,3};
        partition(arr, 0, arr.length-1);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
