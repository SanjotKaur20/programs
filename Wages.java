import java.util.Scanner;

public class Wages {
    public static void main(String[] args) {
        System.out.println("Enter the Age");
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        System.out.println("Enter Gender(M/F)");
        char a=scanner.next().charAt(0);
        if(s>=18 && s<30 && a=='M'){
            System.out.println("Your wage is 700");
        } else if (s>=18 && s<30 && a=='F' ) {
            System.out.println("Your wage is 750");

        } else if (s>=30 && s<=40 && a=='M') {
            System.out.println("Your wage is 800");

        }
        else if (s>=30 && s<=40 && a=='F'){
            System.out.println("Your wage is 850");
        }
    }
}
