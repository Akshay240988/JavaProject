package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add(33);
        collection.add("Akshay");
        collection.add(99);
        collection.add(0.45f);

        Iterator i = collection.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
