import  java.util.*;
public class Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
;        int a=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();

        int area ,perimeter;
        area=a*b;
        perimeter=2*(a+b);
        System.out.println("Area"+area);
        System.out.println("perimeter"+perimeter);


    }
}
