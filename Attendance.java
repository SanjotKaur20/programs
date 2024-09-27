import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Total number of working days");
        int a=scanner.nextInt();
        System.out.println("Enter Total number of Absent days");
        int b=scanner.nextInt();
        int sum=a+b;
        int per=(a/sum)*100;
        if (per>75){
            System.out.println("You are not able to sit in exam");

        }
        else {
            System.out.println("You are able to sit in exam");
        }
    }
}
