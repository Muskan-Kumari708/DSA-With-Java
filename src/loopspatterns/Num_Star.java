package loopspatterns;

public class Num_Star {
    public static void main(String[] args){
        int count = 0;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=(i*2)-1;j++){
                if (j%2==0){
                    System.out.print("*");
                }
                else {
                    count = count+1;
                    System.out.print(count);
                }

            }
            System.out.println();
        }
    }
}
