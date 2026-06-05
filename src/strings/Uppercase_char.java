package strings;

public class Uppercase_char {
    public static void main(String[] args){
        String name = "MUSKAN";
        int count = 0;
        for (int i=0;i<name.length();i++){
            for (char ch = 'A';ch<='Z';ch++){
                if (name.charAt(i)==ch) {
                    count = count+1;
                }
            }
        }
        System.out.println(count);
    }

}
