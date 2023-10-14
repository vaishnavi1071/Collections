import java.util.HashMap;
import java.util.Iterator;

public class map {
    public static void main(String[] args) {
        HashMap hp = new HashMap();

        hp.put("name","vaishnavi");
        hp.put("id",1);
        hp.put(null,90);
        hp.put("city","pune");
        hp.put("MobNo",null);
        System.out.println(hp);
        Iterator itr = hp.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(hp.get("city"));
        System.out.println(hp.clone());
        System.out.println(hp.containsKey(9));
        System.out.println(hp.isEmpty());
    }
}
