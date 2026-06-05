package Recursion;

public class ClimbStairs {
    public static int stairsClimb(int n){
        if (n == 1){
            return 1;
        } else if (n == 2) {
            return 2;
        }
        else {
            return stairsClimb(n - 1) + stairsClimb(n - 2);
        }

    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(stairsClimb(n));
    }
}
