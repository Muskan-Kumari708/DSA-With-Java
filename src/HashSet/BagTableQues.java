package HashSet;

import java.util.HashSet;

public class BagTableQues {
    static void main(String[] args) {
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        int[] bag = {2,1,1,3,2,3};
        for (int i=0;i<bag.length;i++){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
            }
            if(table.size() > max){
                max = table.size();
            }
        }
        System.out.println(max);

    }
}
