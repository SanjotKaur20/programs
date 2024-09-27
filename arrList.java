import java.util.ArrayList;

public class arrList {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Porshe");
        cars.add("Telsa");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(2));
        cars.set(1,"Alto");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);

    }
}
