package toPointers;

public class RemoveDuplicateFromStoredArray {
    public static int  duplicate(int [] a){
        int n = a.length;

        int i=0;
        int j=i+1;
        while (j<n){

            if (a[i] != a[j]){
                i++;
                a[i] = a[j];
            }
            j++;
        }
        return i+1;

    }
    public static void main(String[] args){
        int [] a = {0,0,1,1,1,2,2,3,3,4};
        int n = a.length;
        int  ans = duplicate(a);
        System.out.println(ans);
        for (int k=0;k<ans;k++){
            System.out.print(a[k]);
        }

    }
}
