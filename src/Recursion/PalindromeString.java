package Recursion;

public class PalindromeString {
    public static String reverStr(String str , int idx){
        if (idx < 0) {
            return "";
        }
         return str.charAt(idx) + reverStr(str, idx-1) ;


    }

    public static void main(String[] args){
        String str = "abac";
        String ans = reverStr(str , str.length()-1);
        if (ans.equals(str)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
