import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[1000];
        int i = 0;
        int count = 0;
        do {
            sequence[i] = scanner.nextInt();
            if (sequence[i] == 0) {
                break;
            }
            count++;
            i++;
        } while (true);
        for (int j = 0; j < count; j++) {
            if (sequence[j] % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
    }
}
