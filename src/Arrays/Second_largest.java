package Arrays;

public class Second_largest {
    public static int Seclargest(int [] a){
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i=1;i<a.length;i++){
            if (a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            } else if (a[i] < largest && a[i]>secondLargest) {
                secondLargest = a[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        int [] a = {3,8,0,4,6};
        System.out.println(Seclargest(a));
    }
}
