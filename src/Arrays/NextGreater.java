package Arrays;

public class NextGreater {
    public static void greater(int [] a){
        int [] result = new int[a.length];
        for (int i=0;i<a.length;i++){
            result[i] = -1;
            for (int j=i+1;j<a.length;j++){
                if (a[j]>a[i]){
                    result[i] = a[j];
                    break;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    static void main(String[] args) {
        int[] a = {1,3,2,1,8,6,3,4};
        greater(a);
    }
}
