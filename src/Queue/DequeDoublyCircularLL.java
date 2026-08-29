package Queue;

public class DequeDoublyCircularLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static class dequeLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void insertAtRear(int val){
            Node temp = new Node(val);
            if (size == 0){
                head = temp;
                tail = temp;
                temp.next = temp;
                temp.prev = temp;
            }
            else {
                temp.next = head;
                temp.prev = tail;

                tail.next = temp;
                head.prev = temp;
                tail = temp;

            }
            size++;
        }
        public void insertAtFront(int val){
            Node temp = new Node(val);
            if (size == 0){
                head = temp;
                tail = temp;
                temp.next = temp;
                temp.prev = temp;
            }
            else {
                temp.next = head;
                temp.prev = tail;

                head.prev = temp;
                tail.next = temp;
                head = temp;

            }
            size++;
        }
        public int deleteAtRear(){
            if (size == 0){
                System.out.println("deque is empty !");
                return -1;
            }
            int t = tail.val;
            if (head == tail){
                head = tail = null;
            }
            else {
                tail =  tail.prev;
                tail.next = head;
                head.prev = tail;

            }
            size--;
            return t;
        }
        public int deleteAtFront(){
            if (size == 0){
                System.out.println("deque is empty !");
                return -1;
            }
            int t = head.val;
            if (tail == head){
                tail = head = null;
            }
            else {
                head = head.next;
                tail.next = head;
                head.prev = tail;

            }
            size--;
            return t;

        }
        public void display(){
            if (size == 0){
                System.out.println("queue is empty!");
                return;
            }
            Node t = head;
            do {
                System.out.print(t.val+" ");
                t = t.next;
            }while (t != head);

            System.out.println();
        }
    }
    static void main(String[] args) {
        dequeLL dq = new dequeLL();
        dq.insertAtRear(5);
        dq.insertAtRear(6);
        dq.insertAtRear(7);
        dq.insertAtRear(8);
        dq.insertAtRear(9);
        dq.insertAtFront(4);
        dq.insertAtFront(3);
        dq.insertAtFront(2);
        System.out.println(dq.deleteAtFront());
        dq.deleteAtFront();
        dq.deleteAtRear();
        dq.display();
        System.out.println(dq.size);

    }
}
