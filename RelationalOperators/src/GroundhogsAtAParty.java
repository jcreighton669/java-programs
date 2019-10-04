import java.util.Scanner;

public class GroundhogsAtAParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfReeseCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        if (numberOfReeseCups >= 10 && numberOfReeseCups <= 20 && !weekend) {
            System.out.println(true);
        }
        else if (numberOfReeseCups >= 15 && numberOfReeseCups <= 25 && weekend) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
