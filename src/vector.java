
import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("vaishnavi");
        v1.add(90);
        v1.add(null);
        v1.add(null);
        v1.add(90);
        System.out.println(v1);
        Enumeration en = v1.elements();
        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        System.out.println(v1.capacity());
        System.out.println(v1.remove(3));
        System.out.println(v1.clone());
    }
}
