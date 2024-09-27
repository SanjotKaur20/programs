import java.util.Scanner;

public class Strng {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string");
        String a=scanner.next();
       // if (a.equalsIgnoreCase("Delhi")){
         //   System.out.println("Red Fort");
        //} else if (a.equalsIgnoreCase("Agra")) {
          //  System.out.println("Taj Mahal");

        //} else if (a.equalsIgnoreCase("Jaipur")) {
          //  System.out.println("Jai Mahal");

        //} else if (a.equalsIgnoreCase("Amritsar")) {
          //  System.out.println("Golden Temple");

       // } else if (a.equalsIgnoreCase("Mumbai")) {
         //   System.out.println("Gate way of india");

        //}
        //else {
          //  System.out.println("Invalid input");
        //}
    switch (a) {
        case "Delhi":
            System.out.println("Red Fort");

            break;

        case "Agra":
            System.out.println("Taj Mahal");
            break;
        case "Jaipur":
            System.out.println("Jai Mahal");
            break;
        case "Amritsar":
            System.out.println("Golden Temple");
            break;
        case "Mumbai":
            System.out.println("Gate way of India");
            break;
        default:
            System.out.println("Invalid Input");
            break;


    }
    }


}
