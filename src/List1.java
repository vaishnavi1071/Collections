import java.util.ArrayList;
import java.util.Iterator;

public class List1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(89);
        al.add("kiran");
        al.add('i');
        al.add(9.0);
        al.add(null);
        al.add(null);
        Iterator itr = al.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());

        }

            ArrayList al2 = new ArrayList();
            al2.add("vaishnavi");
            al2.add("sana");
            al.addAll(al2);
            System.out.println(al);

    }
}
