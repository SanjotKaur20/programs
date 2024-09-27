import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to print table");
        int a=scanner.nextInt();
        System.out.println("enter number upto which print the table");
        int b=scanner.nextInt();
        for(int i=1;i<=b;i++) {
            int p = a * i;


            System.out.println(a + " " + "*" + " " + i+" "+"="+" "+p);
        }
    }

}
