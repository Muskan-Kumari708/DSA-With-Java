package strings;

public class Find_Digits {
    public static void main(String[] args){
        String str = "abc@12398";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' ||str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9' ){
                System.out.print(str.charAt(i));
            }
        }
    }
}
