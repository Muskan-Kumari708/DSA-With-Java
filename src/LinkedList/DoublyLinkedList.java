package LinkedList;

public class DoublyLinkedList {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

   public static void displayReverse(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
       System.out.println();
   }
   public static void display2(Node random){ // random is just a node name
        Node temp = random;
        // move this temp prev to backword
        while (temp.prev != null){
            temp = temp.prev;
        }
        // print this list
       while (temp != null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
       System.out.println();

   }

   public static Node insertAtHead(Node head , int val){
        Node t = new Node(val);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
   }
    public static void insertAtTail(Node head , int val){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        // temp ko null ke pass late h first of all

        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
        temp = t;
    }
    public static void insertAtAnyIdx(Node head, int idx, int val){
        if (idx == 0 ){
            insertAtHead(head,val);
            return;
        }
        if (idx == 5){ // 5 is a size of the linked list
            insertAtTail(head,val);
            return;
        }
        Node temp = head;
        for (int i=1;i<= idx-1;i++){
            temp = temp.next;
        }
        Node t = new Node(val);
        t.next = temp.next;
        temp.next.prev = t;
        temp.next = t;
        t.prev = temp;

    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        display(a);
//        displayReverse(e);
//        display2(d);
//       Node newHead = insertAtHead(a, 60);
//        display(newHead);
//        insertAtTail(e, 56);
        insertAtAnyIdx(a,3,50);
        display(a);

    }

}
