import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimumHours = scanner.nextInt();
        int maximumHours = scanner.nextInt();
        int actualHours = scanner.nextInt();

        if (actualHours >= minimumHours && actualHours <= maximumHours) {
            System.out.println("Normal");
        }
        else if (actualHours < minimumHours) {
            System.out.println("Deficiency");
        }
        else if (actualHours > maximumHours) {
            System.out.println("Excess");
        }
    }
}
