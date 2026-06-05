package PrefixAndSuffix;

public class ProductExceptSelf {
    public static int[] Product(int [] a){
        int n = a.length;
        int [] prefMul = new int [n];
        int [] suffixMul = new int[n];
        int [] PrefixSuffixProduct = new int [n];
        //prefix

        prefMul[0] = 1;
        for (int i = 1;i<n;i++){
            prefMul[i] =  prefMul[i-1] * a[i-1];
        }

        //suffix

        suffixMul[n-1] = 1;
        for (int i = n-2;i>=0;i--){
            suffixMul[i] = suffixMul[i+1] * a[i+1];
        }

        //result

        for (int i=0;i<n;i++){
            PrefixSuffixProduct[i] = prefMul[i] * suffixMul[i];
        }
        return PrefixSuffixProduct;


    }
    public static void main(String[] args){
        int [] a = {1,2,3,4};

        int [] ans =  Product(a);
        for (int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }

    }
}
