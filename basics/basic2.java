/*
 🔹 1. == Operator

For primitives (int, char, boolean, byte, etc.):
== compares values.

int a = 10;
int b = 10;
System.out.println(a == b);  // true (same value)


For objects:
== compares references (memory addresses), not contents.

String s1 = new String("hello");
String s2 = new String("hello");
System.out.println(s1 == s2);  // false (different objects in memory)

🔹 2. .equals() Method

Defined in the Object class (and often overridden in other classes).

Used to compare contents (values) of objects.

String s1 = new String("hello");
String s2 = new String("hello");
System.out.println(s1.equals(s2));  // true (same content: "hello")

🔹 3. Special Cases
Strings (very common source of confusion)
String s1 = "hello";  // string pool
String s2 = "hello";  // refers to same object
System.out.println(s1 == s2);      // true  (same reference)
System.out.println(s1.equals(s2)); // true  (same value)


But with new:

String s1 = new String("hello");
String s2 = new String("hello");
System.out.println(s1 == s2);      // false (different objects)
System.out.println(s1.equals(s2)); // true  (same content)

🔹 4. Example with Integer/Wrapper class
Integer x = 128;
Integer y = 128;

System.out.println(x == y);      // false (different objects)
System.out.println(x.equals(y)); // true  (same numeric value)

Integer a = 100;
Integer b = 100;
System.out.println(a == b);      // true (because of Integer caching for -128 to 127)
System.out.println(a.equals(b)); // true

x --> [ Integer object with value 128 ]   (memory location A)
y --> [ Integer object with value 128 ]   (memory location B)

 */

 