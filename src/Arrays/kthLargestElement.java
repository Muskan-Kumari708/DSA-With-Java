package Arrays;

import java.util.Scanner;

public class kthLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        int large = 0;
        int [] a = {7,10,4,3,20,15};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]<a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<k;i++){
           large = a[i];
        }
        System.out.println(large);
    }

}
