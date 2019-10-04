import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long r;
        long sum = 0;
        long temp;
        long n = scanner.nextLong();

        temp=n;
        while(n > 0){
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if(temp == sum) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
