package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    static void main(String[] args) {
        int [] a = {1,4, 3, 2, 5, 6, 7, 8, 1 ,2 , 4, 2, 5,1,2};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : a){
            if(freq.containsKey(el)){
                freq.put(el, freq.get(el)+1);
            }
            else {
                freq.put(el, 1);

            }
        }
        System.out.println(freq);
        int maxFreq = 0;
        int ansKey = 0;
        for (var e: freq.entrySet()){
            if (e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);
    }
}
