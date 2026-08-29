package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class dequeue { // double ended queue
    static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.print(dq);
        dq.removeFirst();
        dq.addFirst(6);
        dq.addFirst(7);
        dq.addFirst(8);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(9); // last add
        System.out.println(dq);
        dq.removeAll(dq);
        System.out.println(dq);



    }
}
