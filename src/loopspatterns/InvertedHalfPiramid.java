package loopspatterns;

public class InvertedHalfPiramid {
    public static void main(String[] args){
        for (int i=8; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
