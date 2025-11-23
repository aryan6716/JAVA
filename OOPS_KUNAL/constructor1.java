package OOPS_KUNAL;

class student {
    int id;
    String name;

    // parameterized constructor
    student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class constructor1 {
    public static void main(String[] args) {
        student s1 = new student(101, "Aryan");
        student s2 = new student(102, "Kunal");

        s1.display();
        s2.display();
    }
}
