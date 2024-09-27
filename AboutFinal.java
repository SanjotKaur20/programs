interface chair{
    void seat();
    void table();
}
class furniture implements chair{
    public void seat(){
        System.out.println("seat");
    }
    public  void table(){
        System.out.println("table");
    }
}




abstract class AC{
     abstract void sum();
}
 final class BC {
    //cannot access this class
     void sum(){
         System.out.println("Sum of BC");
     }
    void sub(){
        System.out.println("Sub is running");
    }
}
class CC {
    void sum(){
        System.out.println("Sum of CC");
    }
    void mul(){
        System.out.println("Mul is running");
    }

}




public class AboutFinal implements ChairTable {
        public void seatOf(){
            System.out.println("seat");
        }
        public void tableOf(){
            System.out.println("table");
        }
    public static void main(String[] args) {




        int r = 89;
        final double pi = 3.14;
        //cannot change value
       // pi=3.90;
        double area=pi*r*r;
        System.out.println(area);
      //  AC ac=new AC();
       // ac.sum();
        //Cannot access
        BC bc=new BC();
        bc.sub();
        bc.sum();
        CC cc=new CC();
        cc.mul();
        cc.sum();
        furniture fn=new furniture();
        fn.seat();
        fn.table();

    }
}