package Arrays;

public class ThirdMaximum {
    public static int maximum(int [] a){
        int Largest = a[0];
        int secLargest = 0;
        int thirdLargest = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]>Largest){
                secLargest = Largest;
                Largest = a[i];
            }
            if (a[i]<Largest && a[i]>secLargest){
                thirdLargest = secLargest;
                secLargest = a[i];
            }
            if (a[i]<secLargest && a[i]>thirdLargest){
                thirdLargest = a[i];
            }
        }
        if (thirdLargest == 0){
            return Largest;
        }
        return thirdLargest;
    }
public static void main(String[] args){
        int [] a = {5,2,2,4,1,5,3};
    System.out.println(maximum(a));


}
}
