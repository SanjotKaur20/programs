import java.util.Scanner;

public class AveragePositive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;
        do {
            System.out.println("Enter integers :");
            number = scanner.nextInt();
            if (number>0) {
                count++;
                sum += number;

            }
        } while (number > 0);
        int average = (int) sum / count;
        System.out.println(average);

}

           }






