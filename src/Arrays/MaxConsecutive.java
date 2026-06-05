package Arrays;

public class MaxConsecutive {
    public static void main(String[] args){
        int [] a = {1,1,0,1,1,1,0,1,1};
        int max_len  = 0;

        for (int i=0;i<a.length;i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[j] != 0) {
                    count++;

                } else {
                    break;
                }


                if (count > max_len) {
                    max_len = count;
                }
              i=j;

            }
        }
            System.out.println(max_len);



    }
}
