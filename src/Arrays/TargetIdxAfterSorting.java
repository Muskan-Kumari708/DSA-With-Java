package Arrays;

import java.util.*;

public class TargetIdxAfterSorting {
    public static List<Integer> targetIndices(int[] a, int target) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<a.length;i++){
            if (a[i] == target){
                ans.add(i);
            }
        }
        return ans;


    }
    public static void main(String[] args){
        int [] a = {1,2,5,2,3};
        int target = 2;
        Arrays.sort(a);
        System.out.println(targetIndices(a , target));
    }
}
