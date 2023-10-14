import java.util.LinkedList;

import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add("vaishnavi");
        l1.add("u are best");
        l1.add(null);
        l1.add(null);
        l1.add("vaishnavi");
        System.out.println(l1);
        ListIterator itr = l1.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
