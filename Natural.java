import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
