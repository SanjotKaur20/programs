import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int flag = 0;
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                flag++;
                System.out.println("Number is not prime");
                break;
            }
            i++;
            }
            if (flag == 0) {
                System.out.println("Number is prime");
            }

        }
    }

