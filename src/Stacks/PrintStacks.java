package Stacks;

import java.util.Stack;

public class PrintStacks {
   public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       // 10, 20, 30, 40 50
       System.out.println(st);
       System.out.println(st.size());
       System.out.println(st.peek());
       st.pop();
       System.out.println(st);

       // Print top most element or 10
       while(st.size() > 1){
           st.pop();
       }
       System.out.println(st);
       System.out.println(st.isEmpty());



    }
}
