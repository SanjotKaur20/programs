import java.util.Scanner;

public class SquareOfNum {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int i=1;
        int num=scanner.nextInt();
        while(i<=num){
        int sq=i*i;
        i++;
        System.out.println(sq);
    }
  }
}