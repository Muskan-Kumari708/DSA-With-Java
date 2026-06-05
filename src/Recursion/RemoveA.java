package Recursion;

public class RemoveA {
    public static String removeA(String str , int idx){
        if (idx == str.length()){
            return "";
        }
        String smallAns = removeA(str, idx+1);
        char current = str.charAt(idx);
        if (current != 'a'){
            return current + smallAns;
        }
        else {
            return smallAns;
        }
    }
    public static void main(String[] args){
        String str = "abcax";
        System.out.println(removeA(str, 0));

    }
}
