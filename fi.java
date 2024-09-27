import java.io.File;

public class fi {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\sanjot\\Desktop\\Sanjot\\cacms.txt");
        if(f.delete()){
            System.out.println("deleted");
        }else{
            System.out.println("no");

    }
}}
