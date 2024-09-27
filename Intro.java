import java.util.Scanner;

class Del{
    private String name;
    private String email;
    private String password;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;

    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email=email;

    }
    String getPassword(){
        return password;
    }
    void setPassword(String password){
        this.password=password;
    }
}

public class Intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Del d=new Del();
       d.setName(sc.next());
        d.setPassword(sc.next());
        d.setEmail(sc.next());
        System.out.println(d.getName());
        System.out.println(d.getEmail());
        System.out.println(d.getPassword());

    }
}
