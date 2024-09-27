import java.util.Scanner;

public class ArmStrng {
    public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int num=scanner.nextInt();
                double sum=0;
                int temp=num;
                while(num!=0) {
                    int rem = num % 10;
                    num=num/10;
                    sum=sum+Math.pow(rem,3);


                }
                if(temp==sum){
                    System.out.println("It is armstrong");
                }
                else {
                    System.out.println("It is not a armstrong number");
                }


            }
        }


