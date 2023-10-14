
import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"vaishnavi");
        ht.put("city","pune");
        ht.put("add","kothrud");
        System.out.println(ht.get(9));
        System.out.println(ht.put(2,89));
        System.out.println(ht.entrySet());
        System.out.println(ht.hashCode());
        System.out.println(ht);
    }
}
