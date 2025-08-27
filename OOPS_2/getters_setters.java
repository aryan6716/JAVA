package OOPS_2;

public class getters_setters {
        public static void main(String[] args) {

        //object 1 of student class
        Student1 x = new Student1();
        x.name = "aryan";
        //x.roll = 76;
        x.percentage = 92;
        // System.out.println(x.getroll());  //0
        
        x.setroll(76);
        System.out.println(x.getroll()); //76
        
    }
}


//getters:acces private
//setters:modify private
