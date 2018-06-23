import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        hashMap.put("1","1");
        hashMap.put("2","1");
        System.out.println(hashMap.hashCode());
        Iterator it  = hashMap.keySet().iterator();
        hashMap.put("1","deepa");
        String a = new String("deepa");
        System.out.println(a.hashCode());
        String b = a;
        System.out.println(b.hashCode());
        a = "ghjk";
        System.out.println(a.hashCode());
        System.out.println(a + " " + b);

        ConcurrentHashMap hashMap1 = hashMap;
        hashMap1.put("1","3");
        System.out.println(hashMap1.hashCode());

        CopyOnWriteArrayList list = new CopyOnWriteArrayList();

        list.add("123");
        list.add("456");
        Iterator it1= list.iterator();
        System.out.println("************************");

    }
}
