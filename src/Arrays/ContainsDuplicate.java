package Arrays;

public class ContainsDuplicate {
    public static void main(String[] args){
        int [] a = {1,2,3,1};
        boolean isDuplicate = false;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] == a[j]){
                    isDuplicate = true;
                }
            }
            if (isDuplicate){
                System.out.println("yes");
                break;
            }
        }

    }
}
