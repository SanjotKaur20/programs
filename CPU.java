class Dell{
    private String name;
    Dell(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setName(String name){
this.name=name;
    }

}




public class CPU {
    public static void main(String[] args) {
        Dell dl=new Dell("hello");
        dl.getName();
        System.out.println(dl.getName());
        dl.setName("Bye");
        System.out.println(dl.getName());
    }
}
