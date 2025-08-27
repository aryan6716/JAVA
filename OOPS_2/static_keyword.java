package OOPS_2;

public class static_keyword  {

    //creating new data type-student
    public static class Student {
        String name;
        int roll;
        static int total_students;

        //constructor
          public  Student(String name,int roll){
            this.name = name;
            this.roll = roll;
            total_students++;
        }
    }
        public static void main(String[] args) {

        //object  of student class
        Student x = new Student("aryan",76);
        System.out.println(x.total_students);//1

        Student y = new Student("rahul",77);
        System.out.println(y.total_students);//2

        Student z = new Student("rohan",78);
        System.out.println(z.total_students);//3

    }
}
