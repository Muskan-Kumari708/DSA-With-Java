package Arrays;

public class Reverse_Array {
    public static void main(String[] args){
        int [] reverse = {6,7,3,4};



        for (int i=0;i<reverse.length/2;i++) {
            int t = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = reverse[i];
            reverse[i] = t;



        }
        for (int i=0;i< reverse.length;i++){
            System.out.print(reverse[i]);
        }
            


    }


}
