import java.sql.Array;
import java.util.*;

public class LoopArrList {
    static String b;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
       // str=sc.next();

            ArrayList<String> car=new ArrayList<String>();
         //   do{
           // car.add(str);

        //    str=sc.next();

        //}while (!str.equalsIgnoreCase("0"));
        //System.out.println(car);
        for (;true;){
            str= sc.next();
            if(str.equals("0")){
                break;
            }car.add(str);
        }
        System.out.println(car);
        for(int i=0;i<car.size();i++) {
            System.out.println(car.get(i));
        }
    }
}
