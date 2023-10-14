import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet t1 =new TreeSet();

//        t1.add("vaishnavi");
//        t1.add(0.9);
//        t1.add('v');


        t1.add(89);
        t1.add(90);
//        t1.add(9.02);
        t1.add(1);

        Iterator itr = t1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }



        System.out.println(t1);

    }
}
