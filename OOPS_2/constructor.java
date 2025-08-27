package OOPS_2;

public class constructor  {

    //creating new data type-student
    public static class Student {
        String name;
        int roll;

        //constructor
          public  Student(String name,int roll){
            this.name = name;
            this.roll = roll;
        }
    }

        public static void main(String[] args) {

        //object 1 of student class
        Student x = new Student("aryan",76);
        System.out.println(x.name);
        System.out.println(x.roll);

    }
}

//constructor has same name as class 
//no return type
//can be called only once
//memory allocated after constructor