package juc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/12 18:50
 *
 * 故障问题：ConcurrentModificationException
 * 解决方案：
 *Map<String,Object> map = new ConcurrentHashMap<>();
 *
 */
public class UnsafeMap {

    public static void main(String[] args) {
        //HashMap<String,Object> map = new HashMap<>();
        Map<String,Object> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
