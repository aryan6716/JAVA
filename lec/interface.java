package lec;
public class LambdaEx {
    public static void main(String[] args) {
        interface Square {
            void square(int a);
        }

        Square result = (a) -> System.out.println(a * a);

        result.square(5);
    }
}

