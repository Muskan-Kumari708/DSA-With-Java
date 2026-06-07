import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=5;
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();

        }
        for (int j=0;j<n;j++){
            if (array[j]==num){
                System.out.println("fount"+j);
                break;
            }


    }

    }
}
