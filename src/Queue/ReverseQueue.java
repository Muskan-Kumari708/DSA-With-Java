package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print(q+" ");
        System.out.println();

        Stack<Integer> st = new Stack<>();

        while (q.size() > 0){
            int x = q.remove();
            st.push(x);
        }

        while (st.size()>0){
            int top = st.pop();
            q.add(top);
        }

        System.out.print(q+" ");



    }
}
