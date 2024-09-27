import java.util.HashSet;

public class HshSet {
    public static void main(String[] args) {
        HashSet<Integer> a=new HashSet<>();
        a.add(2);
        a.add(6);
        a.add(3);
        a.add(2);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.clone());
        System.out.println(a.isEmpty());
        System.out.println(a.contains(2));
        System.out.println(a.add(5));
        System.out.println(a.iterator());
        System.out.println(a.spliterator());
    }
}
