package Arrays;

public class Move_all_zero {
    public static void main(String[] args){
        int [] a1 = {1,0,3,5,0,7};
        int [] a2 = new int[a1.length];
        int pos = 0;

            for (int i = 0; i < a1.length; i++) {
                if (a1[i]!=0){
                    a2[pos]=a1[i];
                    pos++;
                }
            }
            for (int i=0;i<a2.length;i++){
                System.out.print(a2[i]);
            }


    }
}
