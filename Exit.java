import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        String str;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first num");
            int a = scanner.nextInt();
            System.out.println("Enter second num");
            int b = scanner.nextInt();
            System.out.println("Sum is " + (a + b));
            System.out.println("Do you want to continue");
            str=scanner.next();

        }while (str.equalsIgnoreCase("Y"));
    }
}
