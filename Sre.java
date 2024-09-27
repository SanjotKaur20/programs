import java.util.Scanner;

public class Sre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int s = 1;
        int i = 0;

        while (s<num) {
            s = i * 10;

            System.out.println(s);
            i++;


        }
    }
}
