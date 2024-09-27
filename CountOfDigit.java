import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit");
        long a=sc.nextLong();
        int sum=0;
        int count=0;
        for (;a!=0;) {
            long rem = a % 10;
            a = a / 10;
            count++;
        } System.out.println(count);
        }
}
