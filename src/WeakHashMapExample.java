import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new WeakHashMap<>();
        String key1 = new String("KEY1");
        String key2 = new String("KEY2");
        map.put(key1, "VALUE1");
        map.put(key2, "VALUE2");
        System.gc();
        System.out.println("Size : " + map.size());

        key1 = null;
        key2 = null;
        System.gc();
        System.out.println("Size : " + map.size());

    }
}
