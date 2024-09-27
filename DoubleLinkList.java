import java.util.ArrayList;
import java.util.LinkedList;

public class DoubleLinkList {
    public static void main(String[] args) {
        LinkedList<Double> a=new LinkedList<>();
        a.add(0.9999);
        a.add(0.8888);
        a.add(0.7777);
        a.add(0.6666);
        a.add(0.5555);
        System.out.println(a);
        a.addFirst(1.0000);
        a.addLast(0.4444);
        System.out.println(a);
        a.removeFirst();
        a.removeLast();
        System.out.println(a);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
        System.out.println(a.isEmpty());
    }
}
