package ArrayList;
import java.util.ArrayList;

public class reverseArrayList {
    public static void reverse(ArrayList<Integer>list){
        for (int i = 0;i<list.size()/2;i++){
            int temp = list.get(list.size()-i-1);
            list.set(list.size()-i-1, list.get(i));
            list.set(i,temp);

        }
        System.out.println(list);

    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        reverse(list);
    }
}
