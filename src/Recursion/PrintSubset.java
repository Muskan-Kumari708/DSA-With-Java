package Recursion;

import java.util.ArrayList;

public class PrintSubset {
    public static void getSubset(int[] a, int idx, ArrayList<Integer>list){
        // base case
        if (idx == a.length){
            System.out.println(list);
            return;
        }
        // inclusion
        list.add(a[idx]);
        getSubset(a, idx+1,list);

        // Backtracking
        list.remove(list.size()-1);

        // Exclusion
        getSubset(a,idx+1, list);


    }
    public static void main(String[] args){
        int [] arr = {1,2,3};
        getSubset(arr,0,  new ArrayList<>());


    }
}
