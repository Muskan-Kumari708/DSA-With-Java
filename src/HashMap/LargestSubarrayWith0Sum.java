package HashMap;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    static void main(String[] args) {
        int[] a = {15,-2, 2,-8,1,7,10,-25};
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxLen = 0, prefixSum = 0;
        mp.put(0, -1);
        for (int i=0;i<a.length;i++){
            prefixSum += a[i];
            if (mp.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i-mp.get(prefixSum));
            }
            else {
                mp.put(a[i], i);
            }
        }
        System.out.println(maxLen);
        
    }
}
