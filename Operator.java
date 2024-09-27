import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int res;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First number");
        int a =scanner.nextInt();
        System.out.println("Enter Second Number");
        int b=scanner.nextInt();
        System.out.println("Enter operator (+,-,*,/,%");
        char op = scanner.next().charAt(0);
        if(op == '+'){
            res=a+b;
            System.out.println("Your Answer is"+ res);

        }
        else if (op == '-') {
            res=a-b;
            System.out.println("Your Answer is"+ res);


        }
        else if (op == '*'){
            res=a*b;
            System.out.println("Your answer is"+ res);

        } else if (op=='/') {
            res=a/b;
            System.out.println("Your answer is"+ res);

        } else if (op =='%') {
            res=a%b;
            System.out.println("Yoir answer is"+res);

        }
        else {
            System.out.println("Enter the valid input");
        }

    }
}
