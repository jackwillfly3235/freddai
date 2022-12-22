import java.util.Comparator;
import java.util.TreeMap;

public class MyClass {
    String key;
    int count;
    long timestamp;
    TreeMap<String, MyClass> map = new TreeMap(
            new Comparator<MyClass>() {
                @Override
                public int compare(MyClass o1, MyClass o2) {
                    return (int) (o1.timestamp - o2.timestamp);
                }
            }
    );
    public MyClass(String key, int count, long timestamp){
        this.key = key;
        this.count = count;
        this.timestamp = timestamp;
    }
    public void add_mapping(String key, int count, long timestamp){
        map.put(key, new MyClass(key, count, timestamp));
    }
    public int get_feature_value(String key, long timestamp) {
        return map.get(key).count;
    }

}
