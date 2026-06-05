package Recursion;

public class KeypadCombinations {
    public static void combination(String [] kp, String result, String digit){
        if (digit.length() == 0){
            System.out.println(result);
            return;
        }
        int  currNum = digit.charAt(0) - '0';
        String  currChoices = kp[currNum];
        for (int i=0;i<currChoices.length();i++){
            combination(kp,result + currChoices.charAt(i),digit.substring(1));

        }

    }
    public static void main(String[] args){
        String digit = "23";
        String [] kp = {"" , "","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz" };
        combination(kp,"",digit);

    }
}
