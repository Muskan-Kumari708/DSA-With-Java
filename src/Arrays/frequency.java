package Arrays;

public class frequency {
    public static  void  main(String[] args){
        int [] arr = {2,4,5,6,4,3};
        int [] a = {1,2,3,4,5,6};
        for (int j=0;j<a.length;j++){
            int x = a[j];
            int count =0;
            for (int i=0;i<arr.length;i++){
                if (x==arr[i]){
                    count++;


                }
            }

                System.out.println(a[j] + "\t" + count);

        }
    }
}
