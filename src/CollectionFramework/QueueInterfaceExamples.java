package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueInterfaceExamples {
    static void priorityQueueExamples(){
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max pq
        pq.add(8);
        pq.add(90);
        pq.add(5);
        pq.add(3);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
    }


    static void arrayDequeExamples(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addFirst(3);
        dq.addFirst(4);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getLast());
    }
    static void main(String[] args) {
        //priorityQueueExamples();
        arrayDequeExamples();

    }
}
