import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (year >= 1900 && year <= 3000) {
            if (isLeapYear) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}
