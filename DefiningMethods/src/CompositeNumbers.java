import java.util.Scanner;

public class CompositeNumbers {
    public static boolean isComposite(long number) {
        for (int i = 2; i < (int)Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
