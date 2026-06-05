package Recursion;

import java.util.ArrayList;

public class GenerateSubset {
    public static void printSubset(int n , ArrayList<Integer> subset){
        if (n == 0){
            System.out.println(subset);
            return;
        }
        // inclusion
        subset.add(n);
        printSubset(n-1, subset);

        // Backtracking
        subset.remove(subset.size()-1);

        // exclusion
        printSubset(n-1,subset);
    }
    public static void main(String[] args){
        int n = 3;
        printSubset(n, new ArrayList<Integer>());

    }
}
