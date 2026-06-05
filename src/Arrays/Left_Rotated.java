package Arrays;

public class Left_Rotated {
    public static void main(String[] args){
        int [] a = {100,5,20};
        for (int i=0;i<a.length-1;i++){
            int t = a[i+1];
            a[i+1] = a[i];
            a[i] = t;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
