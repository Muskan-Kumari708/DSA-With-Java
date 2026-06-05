package Recursion;

public class TilesPlacement {
    public static int placement(int n , int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
        int varPath = placement(n-m, m);
        int horPath = placement(n-1, m);
        return varPath + horPath;
    }
    public static void main(String[] args){
        int n = 4;
        int m = 2;
        System.out.println(placement(n, m));
    }
}
