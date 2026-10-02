package Backtracking;

public class Permutations {
    public static void permutations(String str, String t){
        int n = str.length();
        if(n==0){
            System.out.println(t);
            return;
        }
        for (int i=0;i<n;i++){
            char curr = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            permutations(rem,t+curr);
        }
    }
    static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
}
