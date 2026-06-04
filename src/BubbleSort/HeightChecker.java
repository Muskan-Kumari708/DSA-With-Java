package BubbleSort;

public class HeightChecker {
    public static void heightChecker(int [] a){
        int first = a[0];
        for (int i = 1;i<a.length;i++){
            if (a[i] < a[i-1]){
                System.out.println(i);
                return;
            }
        }
    }
    public static void main(String[] args){
        int [] heights = {1,1,4,2,1,3};
        heightChecker(heights);
        System.out.println("name muskan");
    }
}
