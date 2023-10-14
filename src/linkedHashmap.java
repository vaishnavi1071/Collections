import java.util.LinkedHashMap;

public class linkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap hp = new LinkedHashMap();
        hp.put("1","vaishnavi");
        hp.put("2", "koli");
        hp.put("city","pune");
        hp.put("add","kothrud");

        System.out.println(hp.get("city"));
        System.out.println(hp.entrySet());
        System.out.println(hp.containsValue(9));
        System.out.println(hp.values());
        System.out.println(hp.isEmpty());

        System.out.println(hp);


    }
}
