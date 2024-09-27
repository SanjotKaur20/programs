import java.util.Scanner;

public class ProductOfDigi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int pro=1;
        do{
            int rem=num%10;
            num=num/10;
            pro=pro*rem;

        }while (num!=0);
        System.out.println(pro);
    }
    }

