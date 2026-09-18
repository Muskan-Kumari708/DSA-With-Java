package HashSet;

import java.util.HashSet;

public class Deceleration {
    static void main(String[] args) {
        HashSet<String> s = new HashSet<>(); // this is unordered set
        s.add("Muskan");
        s.add("Riya");
        s.add("Neha");
        System.out.print(s);
        System.out.println();
        System.out.println(s.contains("Muskan"));
        System.out.println(s.size());
        System.out.println(s.remove("Riya"));

        for (String e: s){
            System.out.println(e);
        }
        System.out.println();

    }
}
