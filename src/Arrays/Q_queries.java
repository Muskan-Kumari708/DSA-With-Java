package Arrays;

import java.util.Scanner;

public class Q_queries {
    public static int [] FrequencyQueries(int [] a){

        int [] freq = new int[100000];
        for (int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        return freq;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();

        }
        int [] freq =  FrequencyQueries(a);

        // For Queries

        System.out.println("Enter the Numbers of Queries : ");
        int Q = sc.nextInt();
        for (int i = Q ;i>0;i--) {
            int var = sc.nextInt();
            if(freq[var]>0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
