import java.util.Scanner;

public class ExcHand {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int b=3;
        try{
            if (b>2){
                throw new ArrayIndexOutOfBoundsException("Error!!!");
            }
            System.out.println(4/0);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Arithmetic error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally running");
        }

        try{
            int a=scanner.nextInt();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
