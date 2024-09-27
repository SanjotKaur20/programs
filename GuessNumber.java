import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
int count=0;
        int b;
        int a = (int) (Math.random() * 100);
        do{
        System.out.println("Guess the number");

            b = sc.nextInt();
            count++;
            if (a == b) {
                System.out.println("You win ");
                System.out.println("You took  "+count+" tries");

            } else {

                System.out.println("You are off by this number "+(Math.abs(a-b)));


            }

           // System.out.println("Do you want to continue(Y/N)");
           // str=sc.next();

        } while (true);

    }
}