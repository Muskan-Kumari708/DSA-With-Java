package MergeSort;

public class MergeSortedArray {
    public static void merging(int [] num1, int m, int [] num2, int n){
        int n1 = m+n;
        int [] temp = new int[m+n];
        int i=0;
        int j=0;
        int k = 0;
        while (i<m && j<n){
            if (num1[i] <= num2[j]){
                temp[k] = num1[i];
                k++;
                i++;
            }
            else {
                temp[k] = num2[j];
                j++;
                k++;
            }
        }
        while (j<n){
            temp[k] = num2[j];
            j++;
            k++;
        }
        for (int p=0;p<temp.length;p++){
            System.out.print(temp[p]+" ");
        }

    }
    public static void main(String[] args){
        int [] num1 = {1,2,3,0,0,0};
        int m = 3;
        int [] num2 = {2,5,6};
        int n = 3;
        merging(num1,n,num2,n);

    }
}
