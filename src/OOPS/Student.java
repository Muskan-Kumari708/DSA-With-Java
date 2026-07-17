package OOPS;

public class Student {
    // we can create different class

    String name;
         int roll;
        double percent;
        final String SchoolName = "RPSIT"; // can not change this value
        private static int NumberOfStudents;

        // constructor
        public Student(String nam,int Roll,double per){
             name = nam;
             roll = Roll;
             percent = per;
             NumberOfStudents++;



        }
        public static int getNumberOfStudents(){
            return NumberOfStudents;
        }

        // for get value
    public int getRoll(){ //getter

        return roll;
    }

    // for set value
   public  void setRoll(int Roll){ //setter
       roll = Roll;

    }



}
