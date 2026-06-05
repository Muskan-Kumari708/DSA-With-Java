package Arrays;

public class BuyAndSellStock {
    public static void main(String[] args){
        int [] a = {7,1,5,3,6,4};
        int max_profit = 0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                int profit = a[j]-a[i];
                if (profit>max_profit){
                    max_profit = profit;
                }

            }
        }
        System.out.println(max_profit);

    }
}
