package SortingProblem;

import java.util.ArrayList;

public class PartitionGivenPivot {
    public static void stablePartition(int [] a, int pivot){
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        int i = 0;
        while (i<a.length){
            if (a[i] < pivot){
                small.add(a[i]);
                i++;
            } else if (a[i] > pivot) {
                large.add(a[i]);
                i++;

            }
            else {
                equal.add(a[i]);
                i++;
            }

        }
        int k = 0;
       for (int j=0;j<small.size();j++){
           a[k] = small.get(j);
           k++;
       }
        for (int j=0;j<equal.size();j++){
            a[k] = equal.get(j);
            k++;
        }
        for (int j=0;j<large.size();j++){
            a[k] = large.get(j);
            k++;
        }

        for (int p=0;p<a.length;p++){
            System.out.print(a[p]+" ");
        }

    }
    public static void main(String[] args){
        int[] a = {9,12,5,10,14,3,10};
        stablePartition(a,10);

    }
}
