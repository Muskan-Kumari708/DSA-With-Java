package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DisplayAndAnalyze {
    static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Aman", 20);
        mp.put("Neha", 22);
        mp.put("Riya", 25);
        System.out.println(mp);
        System.out.println(mp.get("Neha"));
        System.out.println(mp.get("Muskan"));
        mp.put("Riya", 23);
        System.out.println(mp);
        System.out.println(mp.remove("Riya"));
        System.out.println(mp);
        mp.putIfAbsent("Aman", 24); // will not enter
        mp.putIfAbsent("Rahul", 24);
        System.out.println(mp);
        System.out.println(mp.containsKey("Riya")); // false
        System.out.println(mp.containsKey("Aman")); // true
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        // Traversing entire HashMap
        for (String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        for (var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }
}
