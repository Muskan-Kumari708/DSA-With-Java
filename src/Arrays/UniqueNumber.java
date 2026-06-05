package Arrays;

public class UniqueNumber {
    public static int unique(int [] a){
        for (int i=0;i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    a[i] = -1;
                    a[j] = -1;
                }
            }

            }
        int ans = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]!=-1){
                ans = a[i];
            }
        }
        return ans;

        }


    public static void main(String[] args){
        int [] a = {1,2,3,4,2,1,3};
        System.out.println(unique(a));
    }
}
