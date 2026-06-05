package SelectionSort;

public class SortFruits {
    public static void fruitsPrint(String [] s){
        for (int i=0;i<s.length;i++){
            int min_idx = i;
            for (int j= i+1; j<s.length;j++){
                if (s[j].compareTo(s[min_idx]) < 0){
                    min_idx = j;
                }
            }
            String t = s[i];
            s[i] = s[min_idx];
            s[min_idx] = t;

        }
        for (int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void main(String[] args){
        String [] s = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        fruitsPrint(s);

    }
}
