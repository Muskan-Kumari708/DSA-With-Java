package toPointers;

import java.util.Arrays;

public class Sum4 {
    public static   void   Sum(int [] a, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i>0 && a[i] == a[i-1]){
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (j>i+1 && a[j] == a[j-1]){
                    continue;
                }
                int left = j + 1;
                int right = a.length - 1;
                while (left < right) {
                     int sum = a[i] + a[j] + a[left] + a[right];
                    if (sum == target) {
                        System.out.println(a[i] +" "+ a[j] +" "+ a[left] +" "+ a[right]);
                        left++;
                        right--;

                        while (left < right && a[left] == a[left - 1]) {
                            left++;
                        }
                        while (left < right && a[right] == a[right + 1]) {
                            right--;
                        }
                    } else if (sum > target) {
                        right--;

                    } else {
                        left++;
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] a = {-1,0,-5,-2,-2,-4,0,1,-2};
        int target = -9;
        Arrays.sort(a);
        Sum(a,target);
    }




}
