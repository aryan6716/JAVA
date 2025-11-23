package OOPS_KUNAL;

public class main {

    // creating new data type-student for every single student
    public static class Student {
        String name;
        int roll;
        double percentage;
    }

    public static void change(Student s) {
        s.name = "rahul";
    }

    public static void main(String[] args) {

        // object 1 of student class
        Student x = new Student(); // creating obj of student using new which dynamically allocates memory at
                                   // runtime and return refrence to it

        // Student x : at compile time ; new Student() : at runtime which dynamically
        // allocates the memory while running

        x.name = "aryan"; // x is instance of student class(link class using dot operator)
        x.roll = 76;
        x.percentage = 92;
        System.out.println(x.name);
    }
}
// instance variables : variables inside the class and outside method or
// constructor(name,roll,percentage)

// | **Data Type** | **Default Value** |
// | --------------------- | ------------------------- |
// | `byte` | 0 |
// | `short` | 0 |
// | `int` | 0 |
// | `long` | 0L |
// | `float` | 0.0 |
// | `double` | 0.0d |
// | `char` | '\u0000' (null character) |
// | `boolean` | false |
// | `String` / any object | null |
