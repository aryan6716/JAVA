package OOPS_2;

public class acces_modifiers {

    //creating new data type-student
    public static class Student{
        private String name;
        int roll;
        double percentage;
    }
        public static void main(String[] args) {

        //object of student class
        Student x = new Student();
        x.name = "aryan";
        x.roll = 76;
        x.percentage = 92;
        System.out.println(x.name);    
    }
}

//it will run as it is but we make another folder of same class then will face am error
