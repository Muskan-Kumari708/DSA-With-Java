package CollectionFramework;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.*;

public class MapInterfaceExamples {
    static void main(String[] args) {
//        HashMap<Integer, String> mp = new HashMap<>();
//        HashMap<Integer, String> mp = new LinkedHashMap<>();
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(2,"Riya");
        mp.put(1,"Muskan");
        mp.put(3,"Neha");

//        for (Integer i : mp.keySet()){
//            System.out.println(i);
//        }
//        for (String i : mp.values()){
//            System.out.println(i);
//        }
        for (var i : mp.entrySet()){
            System.out.println(i);
        }

//        System.out.println(mp);
        mp.put(1, "Neha"); // over ride
//        System.out.println(mp);
//        System.out.println(mp.get(2));
//        System.out.println(mp.containsKey(4));
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
    }
}
