package Queue;

public class ArrayImplementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] a = new int[10];
        public void add(int val){
            if(r == a.length-1){
                System.out.println("queue is full!");
            }
            if(f==-1){
                f = r = 0;
                a[0] = val;
            }
            else{
                a[++r] = val;
            }
            size++;
        }
        public int remove(){
            if (f == -1){
                System.out.println("queue is empty!");
                return -1;
            }
                int x = a[f];
                f++;
                size--;
                return x;


        }
        public int peek(){
            return a[f];
        }
        public boolean isEmpty(){
          if (size == 0){
              return true;
          }
          return false;
        }
        public void display(){
            if(size==0){
                System.out.println("stack is empty!");
            }
            for (int i =f;i<=r;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.remove();
        q.display();

    }
}
