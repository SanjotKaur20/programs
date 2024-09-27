import java.util.Scanner;
class newArm {


    void strong(int num) {
        for (int i = 1; i <= num; i++){
        int count = 0;
        int temp = i;
            double sum = 0;

        for (; temp!= 0; count++) {
            temp = temp / 10;

        }
        temp=i;
        for (; temp != 0; ) {
            int rem = temp % 10;

            temp = temp / 10;

            sum = sum + Math.pow(rem, count);
        }
         temp=i;
        if (temp== sum) {
            System.out.print(i + "  ");

        }

    }
}}

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        newArm na=new newArm();
        na.strong(n);


    }
}
