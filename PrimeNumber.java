import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag++;
                System.out.println("Number is not prime");
                break;
            }}
            if (flag==0){
                System.out.println("Number is prime");
            }

        }
    }

