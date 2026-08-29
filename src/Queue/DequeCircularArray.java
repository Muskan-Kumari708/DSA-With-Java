package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeCircularArray {
    public static class deque{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] a = new int[5];
        public void insertAtRear(int val){
            if (size == 0){
                f = r = 0;
                a[0] = val;
            } else if (size == a.length) {
                System.out.println("deque is full !");
                return;
            } else if (r == a.length-1) {
                r = 0;
                a[0] = val;
            } else if (r < a.length-1) {
                a[++r] = val;

            }
            size++;
        }
        public void insertAtFront(int val){
            if (size == 0){
                f = r = a.length-1;
                a[a.length-1] = val;
            }
            else if (size == a.length){
                System.out.println("deque is full !");
                return;
            } else if (f == 0) {
                f = a.length-1;
                a[f] = val;

            } else if (f > 0) {
                a[--f] = val;

            }
            size++;
        }
        public  int deleteAtRear(){
            if (size == 0){
                System.out.println("deque is empty !");
            }
            else if (f<r) {
                int x = a[r];
                r--;
                size--;
                return x;

            } else if (r<f) {
                int x = a[r];
                if (r == 0){
                    r = a.length-1;
                }
                else {
                    r--;
                }
                size--;
                return x;


            } else if (r == f) {
                int x = a[r];
                r = f = -1;
                size--;
                return x;

            }
            return -1;
        }
        public int deleteAtFront(){
            if (size == 0){
                System.out.println("deque is empty !");
                return -1;
            }
            int x = a[f];
             if (f<r) {
                f++;

            }
             else if (f == r){
                 r = f= -1;

             }
            else { // f > r
                if (f == a.length-1){
                    f = 0;
                }
                else {
                    f++;
                }
             }

            size--;
            return x;

        }
        public int getAtFront(){
            if (size == 0){
                System.out.println("deque is empty !");
                return -1;
            }
            return a[f];
        }
        public int getAtRear(){
            if (size == 0){
                System.out.println("deque is empty !");
                return -1;
            }
            return a[r];

        }

        public void display(){
            if (size == 0){
                System.out.println("deque is empty !");
                return;
            }
            int i = f;
            while (true){
                System.out.print(a[i]+" ");
                if (i==r){
                    break;
                }
                i = (i+1)%a.length;

            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        deque dq = new deque();
        dq.deleteAtFront();
        dq.insertAtRear(2);
        dq.insertAtRear(3);
        dq.insertAtRear(4);
        dq.insertAtRear(5);
        dq.insertAtFront(1);
        dq.deleteAtRear();
        dq.deleteAtFront();
        System.out.println(dq.size);
        dq.display();
        System.out.println(dq.getAtFront());
        System.out.println(dq.getAtRear());


    }
}
