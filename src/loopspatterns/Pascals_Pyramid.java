package loopspatterns;

public class Pascals_Pyramid {
    public static void main(String[] args){
        for (int i=0;i<5; i++){
            int num=1;

            for (int s=1; s<5-i;s++){
                System.out.print(" ");
            }



            for (int j=0; j<=i; j++){
                System.out.print(num+" ");
                    num = num*(i-j)/(j+1);


            }
            System.out.println();
        }
    }
}
