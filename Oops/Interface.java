package Oops;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        client c = new Aryan();
        c.input();
        c.output();
    }
}

interface client {
    void input();

    void output();
}

class Aryan implements client {
    String name;
    double sal;

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter username: ");
        name = s.nextLine();
        System.out.println("enter salary: ");
        sal = s.nextDouble();
        s.close();
    }

    public void output() {
        System.out.println(name + "\n" + sal);
    }
}
// enter username:
// aryan
// enter salary:
// 4000000
// aryan
// 4000000.0

// Interface methods are public Because they must be accessible to any code
// using the interface
// Interface methods are abstract Because they have no body — only the
// declaration