package Stacks;

import java.util.Stack;

public class PrintSameOrderII {
    // using through Array
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int n = st.size();
        int [] a = new int[n];
        for (int i=n-1;i>=0;i--){
            a[i] = st.pop();
        }
        //System.out.println(st);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
            st.push(a[i]);
        }

    }
}
