import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyClass {
    Map<String, TreeMap<Long, Integer>> map = new HashMap<>();

    public void add_mapping(String key, int count, long timestamp){
        TreeMap<Long, Integer> treeMap = new TreeMap<>();
        treeMap.putIfAbsent(timestamp, count);
        map.put(key, treeMap);
    }
    public int get_feature_value(String key, long timestamp) {
        return map.get(key).get(timestamp);
    }

    public static void main(String args []){
        MyClass myClass = new MyClass();
        myClass.add_mapping("key1", 2, System.currentTimeMillis());
    }

}
