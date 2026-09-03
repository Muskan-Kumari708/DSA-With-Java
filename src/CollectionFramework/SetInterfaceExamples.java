package CollectionFramework;

import java.util.*;

public class SetInterfaceExamples {
    static void hashSetExamples(){
        //HashSet<Integer> h = new HashSet<>(); // it is print in unordered form
        LinkedHashSet<Integer> h = new LinkedHashSet<>(); // ordered
        h.add(1);
        h.add(3);
        h.add(49);
        h.add(90);
        h.add(50);
        System.out.println(h);
        h.remove(3);
        System.out.println(h);
        h.add(49);
        h.add(90);
        System.out.println(h);
        System.out.println(h.contains(49));
    }
    static void main(String[] args) {
        hashSetExamples();

    }
}
