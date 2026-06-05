package strings;

public class Anagram {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = false;

        if (s1.length() == s2.length()){
            isAnagram = true;

            for (char ch='a';ch<='z';ch++){
                int count1=0;
               int count2=0;
                for (int i=0;i<s1.length();i++) {
                    if (s1.charAt(i) == ch) {
                        count1++;
                    }
                }
                for (int j=0;j<s2.length();j++){
                    if (s2.charAt(j)==ch){
                        count2++;
                    }

                }
                if (count1 != count2){
                    isAnagram=false;
                    break;
                }
            }
        }
        if (isAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }


    }
}
