package LinkedList;

public class Implementation {
//    public static void insertAtEnd(Node head, int val){
//        Node temp = new Node(val);
//        Node t = head;
//        while (t.next != null){
//            t = t.next;
//        }
//        t.next = temp;
//    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{  // we can create  using OOPS concepts
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){ // empty list
                head = temp;
            }
            else { // non_empty list
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void insertAtIndex(int idx, int val){
            Node t = new Node(val);
            Node  temp = head;
            if (idx == size()){
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                    insertAtHead(val);
                    return;
                }
            if (idx < 0 || idx > size()){
                System.out.println("Wrong Index");
                return;
            }

            for (int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }
        int getAt(int idx){
            Node temp = head;
            for (int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAtIdx(int idx){
            Node temp = head;
            if (idx == 0){
                head = head.next;
            }
            for (int i=1;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
        int  size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {  // we can create  using OOPS concepts
        linkedlist ll = new linkedlist(); // ye linkedlist ka built-in function nii h ye list h linkedlist ka
        ll.insertAtEnd(4); // 4
        ll.insertAtEnd(5); // 4 5
        ll.display();
        System.out.println("length is : "+ll.size());
        ll.insertAtHead(8);
        ll.display();
        System.out.println();
        ll.insertAtIndex(3,9);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(2));
        System.out.println();
        Node a = new Node(7);
        //insertAtEnd(a,7);
        ll.deleteAtIdx(4);
        ll.display();
//       System.out.println(ll.tail.data);
    }
}
