package Stacks;

import java.util.Stack;

public class RemoveConsecutiveSub {
    public static int[] remove(int[] a){
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        for (int i=0;i<a.length;i++){
            if(st.size() == 0){
                st.push(a[i]);
            } else if (st.peek() == a[i]){
                if (a[i] != a[i+1]){
                    st.pop();
                }
            }
            else if(st.peek() != a[i]){
                st.push(a[i]);
            }

        }
        int [] ans = new int[st.size()];
        for (int i = ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }

        return ans;
    }
    static void main(String[] args) {
        int[] a = {1,2,2,3,10,10,10,4,4,4,5,7,7,7,2};
        int[] ans = remove(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
