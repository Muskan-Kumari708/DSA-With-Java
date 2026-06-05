package Arrays;

public class majority_element {
    public static void main(String[] args){
        int [] a1 = {2,1,5,2,4,2,2,2,2,2};
        for (int i=0;i<a1.length;i++) {
          int count =0;
            for (int j = 0; j < a1.length; j++) {
                if (a1[i] == a1[j]) {
                    count++;
                }

            }
           if (count>a1.length/2){
               System.out.println("Majority element is  :"+"\t"+a1[i]);
               break;
           }

        }



//        (Second Method)

//        int [] a2 = {1,2,3,4,5};
//        for (int i=0;i<a2.length;i++){
//            int count =0;
//            for (int j=0;j<a1.length;j++){
//                if (a2[i]==a1[j]){
//                    count++;
//                }
//            }
//            if (count>a1.length/2){
//                System.out.println(a2[i]);
//            }
//
//
//        }



    }
}
