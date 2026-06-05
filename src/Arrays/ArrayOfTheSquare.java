package Arrays;

public class ArrayOfTheSquare {
    public static int[] square(int [] a){
        int [] ans = new int[a.length];
        int pos = 0;
        for (int i = 0;i<a.length;i++){
            int sqre = a[i]*a[i];
            ans[pos] = sqre;
            pos++;

        }
        return ans;

    }
    public static void main(String[] args){
        int [] a = {2,4,6,7,10};
        int [] ans = square(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");

        }

    }
}
