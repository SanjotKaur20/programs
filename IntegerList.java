import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class IntegerList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int b;
        ArrayList<Integer> a=new ArrayList<>();
        for (;true;){
            b= scanner.nextInt();
            if(b<0){
                break;
            }a.add(b);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
        System.out.println(a.get(a.size()-1));
        System.out.println(a.get(0));


    }
}
