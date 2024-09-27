import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int unit=scanner.nextInt();
        if(unit<=100){
            System.out.println("Your electricity bill is 0");
        } else if (unit>100 && unit<=200) {
            int b=unit-100;
            int c=b*5;
            System.out.println("your bill is "+c);


        }
        else {
            int d=500+(unit-200)*10;
            System.out.println("your bill is"+d);
        }

    }
}
