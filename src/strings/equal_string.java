package strings;

public class equal_string {
    public static void main(String[] args){

        String s1 = "muskan";
        String s2 = "muskan";
        boolean isEqual = true;

        if (s1.length() != s2.length()) {
            isEqual = false;
        }
        else {

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual=false;
                    break;
                }
            }
        }
        if (isEqual){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }




    }
}
