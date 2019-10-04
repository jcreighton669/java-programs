import java.util.Arrays;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        int sum1 = 0, sum2 = 0, count = 0;

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);

        for (int i = 0; i < box1.length; i++) {
            sum1 = sum1 + box1[i];
            sum2 = sum2 + box2[i];

        }
//        if (sum1 > sum2) {
//            System.out.println("Box 1 > Box 2");
//        }
//        else if (sum1 < sum2) {
//            System.out.println("Box 1 < Box 2");
//        }

        if (sum1 == sum2) {
            for (int i = 0; i < box1.length; i++) {
                if (box1[i] == box2[i]) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("Box 1 = Box 2");
            }
            else {
                System.out.println("Incomparable");
            }
        }
    }
}
