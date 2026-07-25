package LinkedList;

public class ImplementationPractice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
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
        void insertAtIdx(int idx, int val){
            Node temp = new Node(val);
            Node t = head;
            if (idx == 0){
                insertAtHead(val);
                return;
            }
            if (idx == size()){
                insertAtEnd(val);
                return;
            }
            for (int i=1;i<=idx-1;i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        int findEle(int idx){
            Node temp = head;
           for (int i=0;i<idx;i++){
               temp = temp.next;
           }
           return temp.data;
        }
        void delete(int idx){
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
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }

        int  size(){
            Node temp = head;
            int count = 0;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
   public static void main(String[] args) {
       linkedlist ll = new linkedlist();
       ll.insertAtEnd(7);
       ll.display();
       ll.insertAtHead(5);
       ll.display();
       ll.insertAtIdx(1,3);
       ll.display();
       System.out.println(ll.findEle(2));
       System.out.println();
       ll.delete(3);
       ll.display();
       System.out.println(ll.tail.data);



    }
}
