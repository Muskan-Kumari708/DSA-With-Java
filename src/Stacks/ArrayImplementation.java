package Stacks;

public class ArrayImplementation {
    static class Stack{
        private int [] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if (isFull()){
                System.out.println("Stack is full ! ");
            }
            arr[idx] = x;
            idx++;
        }
        int pop(){
            if (idx == 0){
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            return top;
        }
        int peak(){
            if (idx == 0){
                return -1;
            }
            return arr[idx-1];

        }
        void display(){
            for (int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
        }
        boolean isEmpty(){
            if (idx == -1){
                return true;
            }
            else {
                return false;
            }
        }
        boolean isFull(){
            if (idx == arr.length){
               return true;
            }
            else{
                return false;
            }
        }
        int  Capacity(){
            return arr.length;
        }

        int currSize(){
            return idx;
        }
    }
    static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //st.pop();
        st.display();
        //System.out.println(st.peak());
        //System.out.println(st.isFull());
    }
}
