package strings;

import java.util.Scanner;

public class Combined_len {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int sum = 0;
        String [] name = new String[n];
        for (int i=0;i<name.length;i++){
            name[i] = sc.nextLine();
        }
        for (int i=0;i< name.length;i++){
            sum = sum+name[i].length();

        }
        System.out.println(sum);
    }
}
