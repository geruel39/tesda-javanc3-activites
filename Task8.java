public class Task8 {
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 6, 2, 2, 24));
    }

    public static int sum(int... numbers) {

        int total = 0;

        for(int number : numbers) {
            int loop = number;
            for(int i = 0; i < loop; i++) {
                total += number;
                number--;
            }
        }

        return total;
    }
}
