import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i=a;i>=0;i--){
            System.out.print(i+" ");
        }
    }
}
