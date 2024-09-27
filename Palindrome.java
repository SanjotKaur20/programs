import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev = 0;
        int temp=num;
        for (; num != 0; ) {
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;


        }
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
