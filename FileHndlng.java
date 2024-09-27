import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHndlng {
    public static void main(String[] args) {
        try {
            File obj = new File("C:\\Users\\sanjot\\Desktop\\Sanjot\\cacms.txt");

            if (obj.createNewFile()) {
                System.out.println("File created "+obj.getName());

            }
            else {
                System.out.println("File already Exist");
            }
        } catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
//        try{
//            FileWriter fileWriter=new FileWriter("C:\\Users\\sanjot\\Desktop\\Sanjot\\cacms.txt");
//            fileWriter.write("Hello Good morning Java\n");
//            fileWriter.write("Hello Good morning Java\n");
//            fileWriter.write("Hello Good morning Java\n");
//            fileWriter.write("Hello Good morning Java\n");
//            fileWriter.close();
//            System.out.println("Completed");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try{
            File obj=new File("C:\\Users\\sanjot\\Desktop\\Sanjot\\cacms.txt");
            Scanner reader=new Scanner(obj);
            while (reader.hasNextLine()){
             String data=reader.nextLine();
                System.out.println(data);
            }
            System.out.println("File ended");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        File obj1=new File("C:\\Users\\sanjot\\Desktop\\Sanjot\\cacms1.txt");
//        System.out.println("Filename "+obj.getName());
//        System.out.println("Path "+obj.getPath());
//        System.out.println("READ "+obj.canRead());
//        System.out.println("WRITE "+obj.canWrite());
//        System.out.println("Size "+obj.length());
//        System.out.println("set "+obj.setReadOnly());
//        System.out.println("set "+obj.setWritable(true));
        System.out.println(obj1.getAbsolutePath());
        if(obj1.delete()){
            System.out.println("File deleted");
        }else {
            System.out.println("could not deleted");

        }

    }
}
