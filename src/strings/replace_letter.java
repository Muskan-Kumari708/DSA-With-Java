package strings;

import java.util.Scanner;

public class replace_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
        String original = sc.nextLine();
        String result = "";
        for (int i=0;i<original.length();i++){
            if (original.charAt(i)=='e') {
                result = result + 'i';
            }
            else {
                result = result + original.charAt(i);
            }

        }

        System.out.println(result);
    }

}
