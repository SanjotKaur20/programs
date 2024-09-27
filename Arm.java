import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 0;
        int count=0;
        int temp =num;

        for (; num != 0; count++) {
            num = num / 10;

        }
num=temp;
        for (; num != 0; ) {
            int rem = num % 10;

            num = num / 10;

            sum = sum + Math.pow(rem, count);

        }
        System.out.println(sum);
        num=temp;
        if (num==sum){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not armstrong");
        }

    }}
