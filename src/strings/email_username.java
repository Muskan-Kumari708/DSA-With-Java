package strings;

public class email_username {
    public static void main(String[] args){
        String email = "apnacollage@gmail.com";
        String username = "";
        for (int i=0;i<email.length();i++){
            if (email.charAt(i)=='@'){
                break;
            }
            else {
                username = username+email.charAt(i);
            }
        }
        System.out.println(username);

    }
}
