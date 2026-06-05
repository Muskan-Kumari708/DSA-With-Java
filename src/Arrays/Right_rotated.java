package Arrays;

public class Right_rotated {
    public static void main(String[] args){
        int [] a = {100,5,12,90,89};
        for (int i=a.length-1;i>0;i--){
            int t = a[i];
            a[i] = a[i-1];
            a[i-1] = t;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
