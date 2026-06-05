package Arrays;

public class Remove_duplicates {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 4, 5, 3};
        int i;
        int j;
      for (i=0;i<a.length;i++) {
          for (j = 0; j < i; j++) {
              if (a[j] == a[i]) {
                  break;
              }

          }

          if (i == j) {
              System.out.println(a[i]);
          }
      }


        }



}
