import java.util.Scanner;

public class CheckTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
