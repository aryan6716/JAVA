package Oops;

public class constructor_types {
    public static void main(String args[]){
        // Student s1 = new Student();
        // Student s2 = new Student("aryan");
        // Student s3 = new Student(123);

        
        
    }
}

class Student{
    String name;
    int roll;

    // un-parameterized constructor
    Student(){
         System.out.print("..........");
    }
                                      //constructor overloading - multiple functions with same name
    // parameterized constructor
    Student(String name){
         this.name = name;
    }
     Student(int roll){
         this.roll = roll;
    }

}