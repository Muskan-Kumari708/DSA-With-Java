package strings;

public class Dupplicate_char {
    public static void main(String[] args){
        String str = "Programing";
        String str1 = str.toLowerCase();
        for (char ch='a';ch<='z';ch++){
            int count = 0;
            for (int i=0;i<str1.length();i++) {
                if (str1.charAt(i) == ch) {
                    count++;
                }
            }
               if (count>1){
                   System.out.println(ch);
               }

        }



    }
}
