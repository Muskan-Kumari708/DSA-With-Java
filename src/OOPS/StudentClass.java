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
       System.out.println(Student.getNumberOfStudents());
       Student s1 = new Student( "muskan",45,8.9);
       System.out.println("NOS1" +" "+s1.getNumberOfStudents());
//       System.out.println(s1.name);
       System.out.println(s1.roll);
//       System.out.println(s1.percent);
       // we can change
       s1.name = "singh";
       System.out.println(s1.name);
       s1.percent = 9.8;
       System.out.println(s1.percent);
       System.out.println(s1.SchoolName);
       Student s2 = new Student("neha",78,9.0);
       System.out.println("NOS2" +" "+s2.getNumberOfStudents());
       Student s3 = new Student("saloni",80,8.0);
       System.out.println("NOS3" +" "+s2.getNumberOfStudents());

//       s1.name = "Neha";
//       s1.roll = 25;
//       s1.percent = 8.9;
//       System.out.println(s1.name);

       // print getter value
//       System.out.println(s1.getRoll());

       // for setter
//       s1.setRoll(78);
//       System.out.println(s1.getRoll());
   }
}
