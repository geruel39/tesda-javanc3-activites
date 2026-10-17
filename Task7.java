import java.util.Scanner;

public class Task7  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println(addition(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }

}
