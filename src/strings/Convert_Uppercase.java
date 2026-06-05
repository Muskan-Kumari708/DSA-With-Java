package strings;

public class Convert_Uppercase {
    public static void main(String[] args){
        String name = "muskan";
        String result = " ";
        for (int i=0;i<name.length();i++){
            for (char ch = 'a';ch<='z';ch++) {
                if (name.charAt(i) == ch) {
                    result = result + (char) (name.charAt(i) - 32);
                }
            }
        }
        System.out.println(result);

    }
}
