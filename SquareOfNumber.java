import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
        int sq=i*i;
        System.out.println(sq);
    }
}
}
