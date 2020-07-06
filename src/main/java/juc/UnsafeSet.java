package juc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author :weixiao
 * @description : Set 并发下不安全
 * @date :2020/3/12 18:26
 *
 * 善于总结：
 * 故障问题：ConcurrentModificationException
 * 解决方案：
 * Set<String> set = Collections.synchronizedSet(new HashSet<>());
 *Set<String> set = new CopyOnWriteArraySet<>();
 */
public class UnsafeSet {
    public static void main(String[] args) {

        //Set<String> set = new HashSet<>();
        //Set<String> set = Collections.synchronizedSet(new HashSet<>());//线程安全
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set);
            },String.valueOf(i)).start();
        }

    }
}
