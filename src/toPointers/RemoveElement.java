package toPointers;

public class RemoveElement {
    public static int  remove(int [] a){
        int val = 3;
        int j=0;
        int i=0;
        while (i<a.length){
            if (a[i]!=val){
                a[j]=a[i];
                j++;
            }
            i++;

        }
        return j;

    }
    public static void main(String[] args){
        int [] a = {3,2,2,3};
        int len = remove(a);
        System.out.println(len);
        for (int k=0;k<len;k++){
            System.out.print(a[k]+"\t");
        }



    }
}
