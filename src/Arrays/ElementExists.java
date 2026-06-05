package Arrays;

public class ElementExists {
    public static boolean  FindNum(int [] a ,int x){
        boolean isfind = false;
        for (int i=0;i<a.length;i++){
            if (a[i]==x){
                isfind = true;
            }
        }
        return isfind;

    }
    public static void main(String[] args){
        int [] a = {4,2,7,1};
        int x = 7;
        System.out.println(FindNum(a,x));

    }
}
