package Recursion;

public class ReverseString {
    public static void reverStr(String str , int idx){
        if (idx < 0){
            return;
        }
        System.out.print(str.charAt(idx));
        reverStr(str, idx-1);
    }

    public static void main(String[] args){
        String str = "abcde";
        reverStr(str , str.length()-1);
    }

}
