package Recursion;

public class InviteNPeople {
    public static int people(int n){
        if (n <= 1){
            return 1;
        }
        int single = people(n-1);
        int pairs = (n-1) * people(n-2);
        return single + pairs;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(people(n));
    }
}
