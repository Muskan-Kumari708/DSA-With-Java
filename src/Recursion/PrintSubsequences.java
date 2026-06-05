package Recursion;

public class PrintSubsequences {
    public static void  printSSQ(String s , String currAns){
        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns+currChar);
        printSSQ(remString , currAns);
    }
    public static void main(String[] args){
        String str = "abc";
        String currAns = "";
        printSSQ(str,currAns);
    }
}
