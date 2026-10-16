import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task5  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList numbers = new ArrayList();

        for(int i = 0; i < 3; i++){
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            numbers.add(input);
        }

        Collections.sort(numbers);
        System.out.println(numbers.getLast());
        System.out.println(numbers.get(0).equals(numbers.get(1))
                && numbers.get(0).equals(numbers.get(2))
                ? "All numbers are equal" : " ");

    }
}
