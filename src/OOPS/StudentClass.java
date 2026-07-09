package OOPS;


public class StudentClass {
    // creating new data type

//    public static class Student{
//        String name;
//        int roll;
//        double percent;
//
//    }
   public static void main(String[] args){
       Student x = new Student();
       x.name = "Muskan";
//      x.roll = 78;

       x.percent = 92.8;
//       System.out.println(x.percent + 8);
//       System.out.println(x.roll);


       Student s1 = new Student();
       s1.name = "Neha";
//       s1.roll = 25;
       s1.percent = 8.9;
//       System.out.println(s1.name);

       // print getter value
       System.out.println(s1.getRoll());

       // for setter
       s1.setRoll(78);
       System.out.println(s1.getRoll());
   }
}
