package Stacks;

import java.util.Stack;

public class CelebrateProblem {
    public static int celebrateProblem(int [][] M){
        int n = M.length;
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++){
            st.push(i);
        }
        while (st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if (M[v1][v2] == 0){
                st.push(v1);
            } else if (M[v2][v1] == 0) {
                st.push(v2);
            }
        }
        if (st.size()==0){
            return -1;
        }
        int potantial = st.pop();
        for (int j=0;j<n;j++){
            if (M[potantial][j] == 1){
                return -1;
            }
        }
        for (int i=0;i<n;i++){
            if (i == potantial){
                continue;
            }
            if (M[i][potantial] == 0){
                return -1;
            }
        }
        return potantial;

    }
    static void main(String[] args) {
        int[][] M = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };
        System.out.println(celebrateProblem(M));

    }
}
