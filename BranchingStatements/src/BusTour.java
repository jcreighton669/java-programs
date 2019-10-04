import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int initialHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();

        int[] bridges = new int[numBridges];
        for (int i = 0; i < numBridges; i++) {
            bridges[i] = scanner.nextInt();
            if (initialHeight >= bridges[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Will not crash");
        }
    }
}
