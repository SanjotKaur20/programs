class Add{
    int Sum(int a,int b){
        return a+b;
    }
    int Sum(int a,int b,int c){
        return a+b+c;

    }
}





public class NewClass {
    public static void main(String[] args) {
        Add ad=new Add();
        int x=ad.Sum(20,30);
        int y=ad.Sum(10,20,30);
        System.out.println(x);
        System.out.println(y);
    }
}
