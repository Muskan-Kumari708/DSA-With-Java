package Stacks;

import java.util.Stack;

public class ReverseStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0){
            gt.push(st.pop());
        }
        System.out.println("reverse stack is: " + gt);

    }
}
