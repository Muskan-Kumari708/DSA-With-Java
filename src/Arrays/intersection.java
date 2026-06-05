package Arrays;

public class intersection {
    public static void main(String[] args){
        int [] a1 = {1,2,3,4,1};
        int [] a2 = {3,4,5,3};
       int []  a3 = new int[a1.length];
       int []  a4 = new  int[a2.length];
       int pos1 =0;
       int pos2=0;
       for (int i=0;i<a1.length;i++) {
           int j;
           for (j = 0; j < i; j++) {
               if (a1[i] == a1[j]) {
                   break;
               }
           }
           if (i == j) {
               a3[pos1] = a1[i];
               pos1++;
           }

       }
       for (int i=0;i<pos1;i++){
           System.out.print(a3[i]+"\t");
       }
        System.out.println();
        for (int i=0;i<a2.length;i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a2[i] == a2[j]) {
                    break;
                }
            }
            if (i == j) {
                a4[pos2] = a2[i];
                pos2++;

            }
        }
        for (int i=0;i<pos2;i++){
            System.out.print(a4[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<pos1;i++){
            for (int j=0;j<pos2;j++){
                    if (a3[i] == a4[j]) {
                        System.out.println(a3[i]);
                    }

            }
        }

    }
}
