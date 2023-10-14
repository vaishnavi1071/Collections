import java.util.HashSet;
import java.util.Iterator;

public class sets {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("sana");
        hs.add("nita");
        hs.add(90);
        hs.add(90);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        Iterator itr = hs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println(hs.contains(90));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());


    }
}
