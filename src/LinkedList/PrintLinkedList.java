package LinkedList;

import org.w3c.dom.Node;

public class PrintLinkedList {
    public static int length(Node a){
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }
    public static void reverseDisplayed(Node head){ // using recursion
        if (head == null){
            return;
        }
        reverseDisplayed(head.next);
        System.out.println(head.data);
    }
    public static void displayed(Node head){ // using recursion
        if (head == null){
            return;
        }
        System.out.println(head.data);
        displayed(head.next);
    }
    public static void Displayed(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static class Node{
        int data; // value
        Node next; // address of next Node
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(7);
//        System.out.println(a.next); //Null
        Node b = new Node(8);
        Node c = new Node(5);
        Node d = new Node(4);
        Node e = new Node(9);
        a.next = b;
//        System.out.println(a.next);// store address of b
        b.next = c;
        c.next = d;
        d.next = e;
//        System.out.println(a.next);
//        System.out.println(a.next.next);
//        System.out.println(a.next.next.next.next);

        // we can simply print using loop
        Node temp = a;
//        System.out.println(temp.data);
//        for (int i=0;i<5;i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//
//        }
        Displayed(a);
        System.out.println();
        displayed(a);
        System.out.println();
        int len = length(a);
        System.out.println("length is :"+len);
        System.out.println();
        reverseDisplayed(a);


    }
}
