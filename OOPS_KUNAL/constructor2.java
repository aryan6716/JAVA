package OOPS_KUNAL;

class Student {
    int id;
    String name;

    // parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // copy constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Aryan"); // normal constructor
        Student s2 = new Student(s1); // copy constructor

        s1.display();
        s2.display();
    }
}
