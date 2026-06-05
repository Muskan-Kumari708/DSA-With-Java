package Recursion;

public class FindIndices {
    public static void findIndex(int [] a , int x , int idx){
        if (idx == a.length){
            return ;
        }
        if (a[idx] == x){
            System.out.println(idx);
        }
        findIndex(a,x,idx+1);


    }
    public static void main(String[] args){
        int [] a = {1,2,3,2,2,5};
        int x = 2;
        findIndex(a,x,0);

    }
}
