import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashset {
    public static void main(String[] args) {
        LinkedHashSet l1 = new LinkedHashSet();
        l1.add("vaishnavi");
        l1.add(90);
        l1.add('v');
        l1.add(9.06);
        l1.add(null);
        System.out.println(l1);
        Iterator itr = l1.iterator();
        while (itr.hasNext()){
        System.out.println(itr.next());
        }
        System.out.println(l1.spliterator());
    }
}
