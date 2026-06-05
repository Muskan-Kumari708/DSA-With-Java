package strings;

public class LengthOfLastWord {
    public static int lastword(String str){
        int count = 0;
        for (int i = str.length()-1;i>=0;i--){
            if (str.charAt(i)==' '){
                break;
            }
            else {
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args){
        String s = "Muskan Singh";
        String str = s.toLowerCase();
        int finalAns = lastword(s);
        System.out.println(finalAns);


    }
}
