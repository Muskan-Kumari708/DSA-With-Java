package Arrays;

public class SortedArrayTwoSumII {
    public static void sortedArray(int [] numbers, int target){
        int  index1 = 0;
        int index2 = numbers.length-1;
        while(index1 < index2) {
            int sum = numbers[index1] + numbers[index2];
            if (sum == target) {

                // for printing 1 based indexing

                System.out.print(index1 + 1+" ");
                System.out.println(index2 + 1);
                index1++;
                index2--;

            } else if (sum < target) {
                index1++;
            } else {
                index2--;
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {2,7,11,15};
        int target = 9;
        sortedArray(arr,target);
    }
}
