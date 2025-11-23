package strings;
public class basic {
    public static void main(String[] args) {

        String str1 = "Hello";

        str1.concat("world");
        System.out.println(str1); //hello

        String str2 = str1.concat("world");
        System.out.println(str2);  //Helloworld

        System.out.println(str1.concat("world"));  //Helloworld

        str1 = str1.concat("world");
        str1 = str1.concat("java");
        System.out.println(str1);  //Helloworld

    }
}

