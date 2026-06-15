package SortingProblem;

public class DNFCountSort {
    public static void countSort(int [] a){
        // Find maximum in array
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        // create count array
        int [] count = new int[max+1];

        // store frequency of each element
        for (int i=0;i<a.length;i++){
            count[a[i]]++;
        }

        // put elements back into original array
        int pos = 0;
        for (int i=0;i< count.length;i++){
            while (count[i] > 0){
                a[pos] = i;
                pos++;
                count[i]--;
            }
        }

        // print sorted array
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }
    public static void main(String[] args){
        int [] a = {0,2,1,2,0,0};
        countSort(a);
    }
}
