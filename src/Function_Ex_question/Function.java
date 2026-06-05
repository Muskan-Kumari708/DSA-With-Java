package Function_Ex_question;

public class Function {
    public static int odd_sum(int n, int sum){
        for (int i=1; i<=n; i++){
            if (i%2 != 0){
                sum =sum+i;
                System.out.println(sum);
            }
            else {
                System.out.println("Even number"+i);
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int n= 10;
        int sum= 0;
        odd_sum(n, sum);

    }
}
