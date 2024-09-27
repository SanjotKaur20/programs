



public class AboutStatic {
    static int a=9;
    static int b=6;
    static void print(){
        System.out.println("Print in aboutStatic class");
    }
static {
    System.out.println("Static block 0");
}
static {
    System.out.println("Static block 1");
}
    public static void main(String[] args) {
        AboutStatic as =new AboutStatic();
        System.out.println(a+b);
        print();

    }
    static {
        System.out.println("Static block 2");
    }
}
