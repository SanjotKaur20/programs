class Hello{
    Hello(int a){
        System.out.println(a);
    }


    Hello(){
        System.out.println("constructor called");
    }

   int a=0;
    int b=0;
    Hello(int a,int b){
         this.a=a;
         this.b=b;
    }
    void print(){
        System.out.println("Hello");
        //System.out.println(a);
    }
    int Sum(int a,int b){
        int c= a+b;
        return c;
    }
    int Sub(){
        return a-b;
    }
}



public class New {
    public static void main(String[] args) {
       Hello obj=new Hello(20,30);
        //System.out.println(obj.Sub());
        System.out.println(obj.a);
        System.out.println(obj.b);
      //obj.a=9;
      //obj.b=3;
       // System.out.println(obj.a);
        //System.out.println(obj.Sum(3,7));
       // System.out.println(obj.Sub());

    }
}
