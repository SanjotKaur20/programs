import java.util.Scanner;

public class SumOfCube {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            int a=i*i*i;
            sum+=a;

        }
        System.out.println(sum);
    }
}
