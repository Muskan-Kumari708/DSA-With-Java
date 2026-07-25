package LinkedList;

public class FindNthNode {
    // 1st method
    public static Node NthNode(Node head,int n) {
        Node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        temp = head;
        for (int i=1;i<=m;i++){
            temp = temp.next;
        }
        return temp;

    }
    // 2nd method
    public static Node NthNode2(Node head,int n){
        Node slow = head;
        Node fast = head;
        for (int i=1;i<=n;i++){
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node removeNthNode(Node head, int n){  // leetcode
        Node slow = head;
        Node fast = head;
        for (int i=1;i<=n;i++){
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        a = removeNthNode(a,6);  // 6 is a total size of linked list
        display(a);


    }
}
