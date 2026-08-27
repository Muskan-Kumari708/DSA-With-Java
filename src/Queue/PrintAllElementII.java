package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllElementII {
    static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        Queue<Integer> q2 = new LinkedList<>();
        while (q1.size() != 0){
            int top = q1.remove();
            System.out.print(" "+ top);
            q2.add(top);
        }
        while(q2.size() != 0){
            int top = q2.remove();
            q1.add(top);
        }

    }
}
