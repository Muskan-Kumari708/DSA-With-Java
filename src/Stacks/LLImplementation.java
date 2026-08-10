package Stacks;

public class LLImplementation {
    public static class Node{ // user defined data type
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{ // user defined data structure
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayReverse(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int pop(){
            if(head == null){
                System.out.println("stack is Empty ! ");
                return -1;
            }
            int t = head.val;
            head = head.next;
            return t;
        }
        int  size(){
            return size;
        }
        boolean isEmpty(){
            if (size() == 0){
                return true;
            }
            return false;
        }
        int peak(){
            return head.val;
        }
        void displayRec(Node h){
            if (h == null){
                return;
            }
            displayRec(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
            displayRec(head);
            System.out.println();
        }
    }
    static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.displayReverse();
        //System.out.println(st.pop());
        //System.out.println(st.size);
        //System.out.println(st.isEmpty());
        //System.out.println(st.peak());
        st.display();

    }
}
