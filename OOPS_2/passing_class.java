package OOPS_2;

public class passing_class {

    //creating new data type-student
    public static class Student {
        String name;
        int roll;
        double percentage;
    }
    public static void change(Student s) {
        s.name = "rahul";
    }
        public static void main(String[] args) {

        //object 1 of student class
        Student x = new Student();
        x.name = "aryan";
        x.roll = 76;
        x.percentage = 92;
        System.out.println(x.name);  //aryan
    change(x);
        System.out.println(x.name); //rahul

//i.e class pass by refrence
    }
}
