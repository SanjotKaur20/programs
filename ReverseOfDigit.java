import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int rev=0;
        for(;num!=0;){
            int rem=num%10;
            num=num/10;
            rev=rev*10+rem;

        }
        System.out.println(rev);
    }
}
