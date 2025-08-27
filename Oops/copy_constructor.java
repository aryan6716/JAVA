package Oops;

public class copy_constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "aryan";
        s1.roll = 4;

        Student s2 = new Student(s1);

        System.out.println("Name: " + s2.name);
        System.out.println("Roll: " + s2.roll);
    }
}

class Student{
    String name;
    int roll;
 
// Default constructor
Student() {
    
}

Student(Student s1){
    this.name = s1.name;
    this.roll = s1.roll;
}

}
