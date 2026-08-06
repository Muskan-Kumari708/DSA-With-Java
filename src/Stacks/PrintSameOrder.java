package Stacks;

import java.util.Stack;

public class PrintSameOrder {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0){
            gt.push(st.pop());
        }
        while (gt.size() > 0){
            int x = gt.pop();
            System.out.println(x);
            st.push(x);
        }
    }
}
