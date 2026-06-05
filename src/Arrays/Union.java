package Arrays;

public class Union {
    public static void main(String[] args){
        int [] a1 = {1,2,3};
        int [] a2 = {3,4,5};
        int [] a3 = new int[a1.length+a2.length];
        int count = 0;
        int pos = 0;
        for (int i=0;i<a1.length;i++){
            a3[pos]=a1[i];
            pos++;
            count++;
        }
        pos = count;
        for (int i=0;i<a2.length;i++){
            a3[pos] = a2[i];
            pos++;
        }
        for (int i=0;i<a3.length;i++){
            System.out.print(a3[i]+"\t");
        }
        System.out.println();
        System.out.println();
        for (int i=0;i<a3.length;i++){
            int j=0;
            for (j=0;j<i;j++){
                if (a3[i]==a3[j]){
                    break;
                }
            }
            if (i==j){
                System.out.print(a3[i]+"\t");
            }
        }


    }
}
