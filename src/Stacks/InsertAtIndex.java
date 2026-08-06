package Stacks;

import java.util.Stack;

public class InsertAtIndex {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Stack<Integer> gt = new Stack<>();
        int Idx = 3;
        int PushValue = 50;
        while (st.size() > Idx){
            gt.push(st.pop());
        }
        // push value at index 2
        st.push(PushValue);
        while (gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println(st);

    }
}
