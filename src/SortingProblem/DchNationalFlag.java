package SortingProblem;

public class DchNationalFlag {
    public static void sort(int [] arr){
        int Count_0 = 0;
        int Count_1 = 0;
        int Count_2 = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] == 0){
                Count_0++;
            } else if (arr[i] == 1) {
                Count_1++;

            }
            else {
                Count_2++;
            }
        }
        int pos = 0;
        while (Count_0 > 0){
            arr[pos] = 0;
            pos++;
            Count_0--;
        }
        while (Count_1 > 0){
            arr[pos] = 1;
            pos++;
            Count_1--;

        }
        while (Count_2 > 0){
            arr[pos] = 2;
            pos++;
            Count_2--;

        }
    }
    public static void main(String[] args){
        int [] a = {0,2,1,2,0,0};
        sort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

    }
}
