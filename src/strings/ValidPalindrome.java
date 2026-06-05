package strings;

public class ValidPalindrome {
    public static boolean palindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(ch)) {
                result = result + ch;

            }
        }
        String x = result;
        String palin = "";
        for (int i= result.length()-1;i>=0;i--){
            palin = palin + result.charAt(i);

        }
      return palin.equals(x);
    }
    public static void main(String[] args){
        String s = "m@ada,m";
        boolean  finalResult = palindrome(s);
        System.out.println(finalResult);

    }
}
