package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class FindMinBracket {
    public static int minBracket(String str){  //remove to make given bracket sequence balanced
        Stack<Character> st = new Stack<>();
        int count = 0;
        int n = str.length();
        for (int i=0;i<n;i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            }
            else {
                if (st.size() == 0){
                    count++;
                }
                else if (st.peek() == '('){
                    st.pop();
                }
                else {
                    count++;
                }
            }
        }
        return count+st.size();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minBracket(str));
    }
}
