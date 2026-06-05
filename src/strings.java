import java.util.Scanner;

public class strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        String [] name = new String[3];
        for (int i=0;i<size;i++){
            name[i] = sc.nextLine();

        }
//        for (int i=0;i< size;i++){
//            sum =  sum+name[i].length();
//        }
//        System.out.println(sum);

        for (int i=0;i< name.length-1;i++){

            for (int s=0;s<name[i].length();s++){
                char ch=name[i].charAt(s);
                System.out.println(ch);
                }

            }


        }












}
