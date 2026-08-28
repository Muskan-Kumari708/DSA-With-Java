package Queue;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public  static  class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int val){
            Node temp = new Node(val);
            if (size == 0){
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int remove(){
            if (size == 0){
                System.out.println("queue is empty!");
                return -1;
            }
            int  x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public int peek(){
            return head.val;
        }
        public void display(){
            if (size == 0){
                System.out.println("queue is empty!");
            }
            Node t = head;
            while (t != null){
                System.out.print(t.val+" ");
                t = t.next;
            }

            System.out.println();
        }
    }
    static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
    }
}
