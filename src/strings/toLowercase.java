package strings;

public class toLowercase {
    public static String lower(String s){
        String result = "";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch>='A' && ch <='Z'){
                result = result + (char)(ch+32);

            }
            else {
                result = result + ch;
            }
        }
        return result;

    }
    public static void main(String[] args){
        String s = "Hello";
        String finalAns = lower(s);
        System.out.println(finalAns);
    }
}
