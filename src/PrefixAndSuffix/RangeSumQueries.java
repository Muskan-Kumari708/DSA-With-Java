package PrefixAndSuffix;

import java.util.Scanner;

public class RangeSumQueries {
    public static int [] sumQueries(int [] a){
        int [] pref = new int[a.length];
        int sum = 0;
        for (int i=0;i<pref.length;i++){
            sum = sum + a[i];
            pref[i] = sum;
        }
        return pref;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int [] ans = sumQueries(a);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }

//        for Queries

        System.out.println("Enter the queries : ");

        int q = sc.nextInt();
        while (q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int answer ;
            if (l==0){
                answer = ans[r];
            }
            else {
                answer = ans[r] - ans[l-1];
            }
            System.out.println(answer);
        }
    }
}
