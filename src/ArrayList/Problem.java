package ArrayList;

import java.util.ArrayList;

public class Problem {
    public static void main(String[] args) {

        // wrapper classes


//    Integer i = Integer.valueOf(4);
//    int i = 4;
//        System.out.println(i);
//    Float f = Float.valueOf(4.5f);
//        System.out.println(f);
//}
        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element

        l1.add(5);
        l1.add(6);
        l1.add(7);

        // get an element at index i;  //6

        System.out.println(l1.get(1));

        // print with for loop

        for (int i =0;i<l1.size();i++){
            System.out.print(" "+l1.get(i));
        }
        System.out.println();

        // printing the array list directly
        System.out.println(l1); // [5,6,7]

        // adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        // modifying element at index i

        l1.set(1,10);
        System.out.println(l1);

        // removing an element at index i;
        l1.remove(1);
        System.out.println(l1); // 5,6,7,8

        // removing an element e

        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        // checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        // if you don't specify class , you a put anything inside l
        ArrayList l = new ArrayList();
        l.add("progress");
        l.add(1);
        l.add(true);
        System.out.println(l);



    }

}
