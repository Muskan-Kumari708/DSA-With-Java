package strings;

public class Count_Space {
    public static void main(String[] args){
        String str = "This is my first codding";
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count=count+1;
            }
        }
        System.out.println("Space is:"+count);
    }
}
