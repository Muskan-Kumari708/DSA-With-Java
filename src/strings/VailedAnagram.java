package strings;

public class VailedAnagram {
    public static void anagram(String s, String t){
        int [] freq = new int[26];
        for (int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagram";
        anagram(s,t);
    }
}
