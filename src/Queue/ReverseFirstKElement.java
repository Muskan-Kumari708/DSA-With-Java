package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElement {
    static void main(String[] args) {
        int k = 3;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int n = q.size();
        System.out.print(q+" ");
        System.out.println();

        Stack<Integer> st = new Stack<>();
        for (int i=0;i<k;i++){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for (int i=0;i<n-k;i++){
            q.add(q.remove());
        }

        System.out.print(q+" ");




    }
}
