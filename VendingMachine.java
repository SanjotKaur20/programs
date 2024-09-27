import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Enter Your Drink :(1-{Coke-10$},2-{Sprite-15$},3-{Pepsi-30$})");
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        System.out.println("Pay Money");
        int m=scanner.nextInt();
        switch (s){
            case 1:
                if(m<10) {
                    System.out.println("Not Sufficient Amount");
                }
                else if (m==10) {
                    System.out.println("Here is your drink");

                } else {
                    int rem=m-10;
                    System.out.println("Here is your Drink and Money" +rem);

                }
                break;
            case 2:
                if(m<15){
                    System.out.println("Not Sufficient Amount");

                } else if (m==15) {
                    System.out.println("Here is your drink");

                } else {
                    int rem=m-15;
                    System.out.println("Here is your Drink and Money" +rem);

                }

                break;
            case 3:
                if(m<30){
                    System.out.println("Not Sufficient Amount");

                } else if (m==30) {
                    System.out.println("Here is your drink");

                } else {
                    int rem=m-30;
                    System.out.println("Here is your Drink and Money" +rem);

                }

                break;

        }

    }
}
