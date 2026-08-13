package Stacks;

import java.util.Stack;

public class StockSpainPrice {
    public static void spainPrice(int[] price){
        // isme hmlog previous greater find karte hai through indexing
        Stack<Integer> st = new Stack<>();
        int [] res = new int[price.length];
        res[0] = 1;
        st.push(0);
        for (int i=1;i<price.length;i++){
            while (st.size()>0 && price[st.peek()] <= price[i]){
                st.pop();
            }
            if (st.size() == 0){
                res[i] = i+1;
            }
            else {
                res[i] = i-st.peek();
            }
            st.push(i);
        }
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    static void main(String[] args) {
        int [] a = {100,80,60,70,60,75,85};
        spainPrice(a);
    }
}
