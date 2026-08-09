package Stacks;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    static void reverse(Stack<Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverse(st);
        PushAtBottom(st,top);
    }

    static  void PushAtBottom(Stack<Integer> st, int top){
        if (st.size() == 0){
            st.push(top);
            return;
        }
        int top1 = st.pop();
        PushAtBottom(st,top);
        st.push(top1);
    }

    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reverse(st);
        System.out.println(st);
    }
}
