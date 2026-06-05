package Arrays;

public class maximum_num {
    public static int maximum(int [] a){
        int max = a[0];
        for (int i = 1;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        int [] a = {1,9,0,8};
        int finalmax = maximum(a);
        System.out.println("Maximum is : " + finalmax);






    }
}
