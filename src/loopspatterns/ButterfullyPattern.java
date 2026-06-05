package loopspatterns;

public class ButterfullyPattern {
    public static void main(String[] args){
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int s=1; s<=(n-i)*2;s++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int s=(n-i)*2; s>=1; s--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
