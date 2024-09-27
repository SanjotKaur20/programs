import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int pro=1;
        for (;num!=0;){
            int rem=num%10;
            num=num/10;
            pro=pro*rem;

        }
        System.out.println(pro);
    }
}
