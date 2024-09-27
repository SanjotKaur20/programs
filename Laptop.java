

class Screen{
    protected void print(){
        System.out.println("I am screen");
    }
}
class Tv extends Screen{
    void printing(){
        System.out.println("I am Tv ");
    }

    protected void print(){
        System.out.println("I am Tv Screen");
    }
}




public class Laptop {
    public static void main(String[] args) {
        Screen sc=new Screen();
        Tv tv=new Tv();
        sc.print();
        tv.print();
        tv.printing();


    }
}
