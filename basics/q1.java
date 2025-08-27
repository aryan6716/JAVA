package basics;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
            sc.close();
        }
    }
}



/*
  ✅ What is sc.hasNextLine()?
sc.hasNextLine() is a method from the Scanner class in Java.
It checks if there is another line of input available to be read.

boolean hasNext = sc.hasNextLine();
Returns true if the input stream has another line.

Returns false if it has reached EOF (End of File).

💡 Why do we use it?
We use hasNextLine() when:

We don’t know how many lines of input there are in advance.

We want to read input until the end (EOF).

It's useful in online judges or coding challenge platforms where the input is given without telling how many 
lines there will be.
 */