package Arrays;

public class EvenOddSegregation {
    public static void main(String[] args){
        int [] a1 = {3,2,5,7,6,4,9,10};
        int [] a2 = new int[a1.length];
        int pos = 0;
        int count = 0;
        for (int i=0;i<a1.length;i++){
            if (a1[i]%2==0){
                a2[pos]=a1[i];
                pos++;
                count++;
            }
        }
        pos = count;
        for (int i=0;i<a1.length;i++){
            if (a1[i]%2 != 0){
                a2[pos]=a1[i];
                pos++;
            }
        }
        for (int i=0;i<a2.length;i++){
            System.out.print(a2[i]+"\t");
        }
    }
}
