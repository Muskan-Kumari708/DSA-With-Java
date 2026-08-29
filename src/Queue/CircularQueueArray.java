package Queue;

public class CircularQueueArray {
    public static class cQA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] a = new int[5];

        public void add(int val){
            if (size == 0){
                f = r = 0;
                a[0] = val;
            }
            else if (size == a.length) {
                System.out.println("queue is full!");
                return;
            } else if (r == a.length-1) {
                r = 0;
                a[0] = val;
            } else if (r < a.length-1) {
                a[++r] = val;
            }
            size++;
        }
        public int remove(){
            if (size == 0){
                System.out.println("queue is empty!");
            } else if (f <= a.length-1) {
                int x = a[f];
                f++;
                size--;
                return x;
            } else if (f == a.length-1) {
                int x = a[f];
                f = 0;
                size--;
                return x;
            }

            return -1;
        }
        public int peek(){
            if (size == 0){
                System.out.println("queue is empty!");
                return -1;
            }
            return a[r];

        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            }
          return false;
        }
        public void display(){
            if (size == 0){
                System.out.println("queue is empty!");
            } else if (f<=r) {
                for (int i=f;i<=r;i++){
                    System.out.print(a[i]+" ");
                }
            } else if (r<f) {
                for (int i=f;i<=a.length-1;i++){
                    System.out.print(a[i]+" ");
                }
                for (int i=0;i<=r;i++){
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }

    }
    static void main(String[] args) {
        cQA q = new cQA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        System.out.println(q.size);
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());


    }
}
