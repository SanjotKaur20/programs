import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                System.out.println(i);

                sum = sum + i;
            }
        }
                System.out.println(sum);


    }
}
