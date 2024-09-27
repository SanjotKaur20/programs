import java.util.Scanner;

class PrimeNum {
    void prime(int num) {
        int flag = 0;
        for (int i = 2; i < num; i++) {
            for (int b = 2; b < i; b++) {
                if (i % b == 0) {

                    flag++;
//                    System.out.println("Number is not prime");
                    break;

                }

            }
                if (flag == 0) {
                    System.out.println(i);
                }
                flag = 0;

            }
        }
    }

public class Prme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        PrimeNum pn=new PrimeNum();
        pn.prime(a);
    }
}
