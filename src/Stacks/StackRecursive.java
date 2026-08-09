package Stacks;

import java.util.Stack;

public class StackRecursive {
    static void pushAtAnyIndex(Stack<Integer> st, int Idx){
        if(st.size() == Idx){
            st.push(8);
            return;
        }
        int top = st.pop();
        pushAtAnyIndex(st,Idx);
        st.push(top);
    }

    static void removeAtIdx(Stack<Integer> st, int Idx){
        if (st.size() == Idx){
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtIdx(st,Idx);
        st.push(top);
    }
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //pushAtAnyIndex(st,1);
        //System.out.println(st);

        removeAtIdx(st,3);
        System.out.println(st);

    }
}
