import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
int num=0;
for(int i=0;i<n;i++) {
    num = num * 10 + 2;
    System.out.print(num + " ");
    sum += num;
}
    System.out.print(sum);

    }
}
