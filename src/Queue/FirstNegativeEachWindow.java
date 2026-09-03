package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeEachWindow {
    static void main(String[] args) {
        int k = 3;
        int[] a = {12,-1,-7,8,-15,30,16,28};
        int n = a.length;
        int[] res = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<n;i++){
            // adding -ve value indices
            if (a[i] < 0){
                q.add(i);
            }
        }

        for (int i=0;i<n-k+1;i++){
            if (q.size() > 0 && q.peek()<i){
                q.remove();
            }

            if (q.size()>0 && q.peek()<=i+k-1){
                res[i] = a[q.peek()];
            } else if (q.size() == 0) {
                res[i] = 0;

            }
            else {
                res[i] = 0;
            }
        }
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
