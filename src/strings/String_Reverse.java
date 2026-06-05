package strings;

public class String_Reverse {
    public static String reverse(String name){
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String name = "muskan";
       String finalAnswer = reverse(name);
        System.out.println(finalAnswer);
    }

}
