package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/29 11:12
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>(16);
        map.put("apple","apple");
        map.put("2","banana");
        map.put("3","abc");
        int h = "apple".hashCode();
        System.out.println(h);
        System.out.println(h ^ (h >>> 16));
    }

}
