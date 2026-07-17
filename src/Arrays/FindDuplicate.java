package Arrays;

public class FindDuplicate {
    public static boolean duplicate(int [] a){
        int max = a[0];
        int min =a[0];
        for (int i = 1;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
            if (a[i]<min){
                min = a[i];

            }
        }
        int [] freq = new int[max-min+1];
        for (int i=0;i<a.length;i++){
            freq[a[i]-min]++;
        }
        for (int i=0;i<freq.length;i++){
            if (freq[i] >1){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args){
        int [] a = {1,2,3,1};
        System.out.println(duplicate(a));
    }
}
