package LinkedList;

public class Implementation {
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
            }
            for (int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

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

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); // 4
        ll.insertAtEnd(5); // 4 5
        ll.display();
        System.out.println("length is : "+ll.size());
        ll.insertAtHead(8);
        ll.display();
        System.out.println();
        ll.insertAtIndex(2,9);
        ll.display();
    }
}
