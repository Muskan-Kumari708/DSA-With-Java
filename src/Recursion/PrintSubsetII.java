package Recursion;

import java.util.ArrayList;

public class PrintSubsetII {
    public static void getSubset(int[] a, int idx, ArrayList<Integer>list){
        // base case
        if (idx == a.length){
            System.out.println(list);
            return;
        }
        // inclusion
        list.add(a[idx]);
        getSubset(a,idx+1,list);

        // backtracking
        list.remove(list.size()-1);

        // for exclusion
        int i = idx + 1;
        while (i< a.length && a[i] == a[i-1]){
            i++;
        }
        getSubset(a,i,list);
    }
    public static void main(String[] args){
        int [] arr = {1,2,2};
        getSubset(arr,0,new  ArrayList<>());
    }
}
