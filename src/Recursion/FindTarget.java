package Recursion;

public class FindTarget {
    public static boolean findValue(int [] a , int target , int idx){
        if (idx == a.length){
            return false;
        }

        if (a[idx] == target){
            return true;
        }
        return findValue(a,target,idx+1);

    }
    public static void main(String[] args){
        int [] a = {4,5,6,7,8};
        int target = 8;
        if (findValue(a,target,0)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
