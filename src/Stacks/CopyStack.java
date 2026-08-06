package Stacks;

import java.util.Stack;

public class CopyStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
//        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0){
            int val = st.pop();
            gt.push(val);
        }
//        System.out.println(st);
//        System.out.println(gt);
        Stack<Integer> at = new Stack<>();
        while (gt.size() > 0){
            at.push(gt.pop());

        }
        System.out.println(at);

    }
}
