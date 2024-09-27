import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
       // int count=0;
       // for(count=0;num!=0;count++){
         //   num=num/10;
        //}
        //System.out.println(count);
        int sum=0;
        for (;num!=0;){
            int rem=num%10;
            num=num/10;
            sum= sum+rem;

        }
        System.out.println(sum);
    }
}
