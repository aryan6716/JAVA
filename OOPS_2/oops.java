package OOPS_2;

public class oops {

    //creating new data type-student
    public static class Student {
        String name;
        int roll;
        double percentage;
    }
        public static void main(String[] args) {

        //object 1 of student class
        Student x = new Student();
        System.out.println(x.name);  //null  default value
        x.name = "aryan";
        x.roll = 76;
        x.percentage = 92;
        System.out.println(x.name);

        //object 2 of student class
        Student y = new Student();
        y.name = "aryan chauhan";
        y.roll = 7;
        y.percentage = 98;
        System.out.println(y.name);
    }
}
