package CollectionFramework;

import java.util.ArrayList;

public class ListInterfaceExamples { // ListInterfaceExamples class List Interface ko implement karti hai
    public static void arrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.print(l+" ");
        System.out.println();
        System.out.println(l.get(2));
        l.set(0,5);
        System.out.print(l+" ");
        System.out.println();
        System.out.println(l.contains(5));
    }
    static void main(String[] args) {
        arrayListExamples();

    }
}
