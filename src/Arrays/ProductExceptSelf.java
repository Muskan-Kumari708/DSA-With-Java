package Arrays;

public class ProductExceptSelf {
    public static int[] Product(int [] a){
        int n = a.length;
        int [] ans = new int[n];
        for (int i=0;i<n;i++){
            int mul = 1;
            for (int j=0;j<n;j++){
                if (j != i){
                    mul = mul*a[j];
                }

            }
            ans[i] = mul;

        }
        return ans;

    }
    public static void main(String[] args){
       int [] a = {1,2,3,4};
        int [] answer = Product(a);
        for (int i=0;i<answer.length;i++){
            System.out.print(answer[i]+"\t");
        }

    }
}
