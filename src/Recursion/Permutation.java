package Recursion;

public class Permutation {
    public static void permutations(String s, String res){
        if (s.length()==0){
            System.out.println(res);
            return;
        }
        for (int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            String smallAns = s.substring(0,i)+s.substring(i+1);
            permutations(smallAns,res+currChar);
        }
    }
    public static void main(String[] args){
        String s = "abc";
        permutations(s,"");

    }
}
