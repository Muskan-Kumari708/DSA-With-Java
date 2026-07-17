package OOPS;

import java.util.Arrays;

public class ArrayList {
    public static class arrayList{
        int [] a = new int[5];
        int idx = 0;
        int size = 0;
        public void add(int ele){
            if (size == a.length){
                int [] b = Arrays.copyOf(a,a.length*2);
                a = b;
            }
            a[idx] = ele;
            idx++;
            size++;
        }
    }
    public static void main(String[] args){
        arrayList a = new arrayList();
        a.add(1);
        a.add(2);
        System.out.println(a.size);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println(a.size);

    }
}
