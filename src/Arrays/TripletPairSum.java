package Arrays;

public class TripletPairSum {
    public static int triplets(int[] a,int target){
        int count = 0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                for (int k=j+1;k<a.length;k++){
                    if (a[i]+a[j]+a[k]==target){
                        count++;
                    }
                }
            }
        }

        return count;

    }
    public static void main(String[] args){
        int [] a = {1,4,2,6,5};
        int target = 12;

        System.out.println(triplets(a,target));

    }
}
