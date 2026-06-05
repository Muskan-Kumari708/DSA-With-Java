package Arrays;

public class Ascending_Array {
    public static void main(String[] args){
        int [] ascending = {4,8,9,5,3,12,890};
        for (int i=0;i<ascending.length;i++){
            for (int j=0;j< ascending.length-1-i;j++){
                if (ascending[j]>ascending[j+1]){
                    int t = ascending[j+1];
                    ascending[j+1]=ascending[j];
                    ascending[j]=t;
                }
            }
        }

        for (int i=0;i< ascending.length;i++){
            System.out.print(ascending[i]+" ");

        }

    }
}
