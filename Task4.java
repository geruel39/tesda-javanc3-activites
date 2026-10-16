import java.util.Scanner;

public class Task4  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        StringBuilder word =  new StringBuilder(input);
        word.reverse();

        if (input.equalsIgnoreCase(word.toString())) {
            System.out.println("The input string is palindrome");
        }else  {
            System.out.println("The input string is not palindrome");
        }

    }
}