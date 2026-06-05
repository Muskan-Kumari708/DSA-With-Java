package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortDescending {
    public static void sortDescending(ArrayList<String>list){
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("banana");
        sortDescending(list);
    }
}
