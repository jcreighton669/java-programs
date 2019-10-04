import java.util.Scanner;

public class RaiseToThePower {

    public static long power(int n, int m) {
        long result = n;
        for (int i = 1; i < m; i++) {
            result *= n;
        }
        if (m == 0) {
            return 1;
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
