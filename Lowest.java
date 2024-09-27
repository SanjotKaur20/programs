import java.util.Scanner;

public class Lowest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=scanner.nextInt();
        System.out.println("Enter second number");
        int b=scanner.nextInt();
        System.out.println("Enter third number");
        int c=scanner.nextInt();
        if(a<b && a<c){
            System.out.println("First number is lowest");
        } else if (b<a && b<c)  {
            System.out.println("Second number is lowest");

        }
        else {
            System.out.println("Third number is lowest");
        }
    }
}
