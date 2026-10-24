import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a,b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a,b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return divideExact(a, b);
    }

    static void main() {
        System.out.println(add(12, 22));
        System.out.println(subtract(22, 43));
        System.out.println(multiply(4,6));
        System.out.println(divide(53, 4));
    }
}
