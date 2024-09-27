import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cost=scanner.nextDouble();
        if(cost>=100000){
            double a=0.15*cost;
            System.out.println("Your total Cost is"+a);

        } else if (cost>50000 && cost<=100000) {
            double b=0.1*cost;
            System.out.println("Your Total cost is"+b);
        }
        else{
            double c=0.05*cost;
            System.out.println("Your yotal cost is "+c);

        }


    }
}
