package Function_Ex_question;

public class Perfect_Num {
    public static int perfect(int n,int sum){

        for (int i=1;i<n;i++){
            if (n%i==0){
                sum = sum + i;
            }

        }
        if (n==sum){
            System.out.println("It is a Perfect Number"+sum);
        }
        else {
            System.out.println("It is not a Perfect Number"+sum);
        }

        return 0;
    }
    public static void main(String[] args){
        int n=6;
        int sum=0;
        perfect(n,sum);

    }
}
