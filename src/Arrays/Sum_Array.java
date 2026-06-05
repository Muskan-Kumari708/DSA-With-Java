package Arrays;

public class Sum_Array {
    public static void main(String[] args){
        int sum = 0;
        int [] sumArray = {1,5,7,9,0,4,8};
        for (int i=0;i< sumArray.length;i++){
            sum =sum+sumArray[i];
        }
        System.out.println(sum);
    }
}
