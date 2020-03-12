package juc;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author :weixiao
 * @description : ArrayList 在单线程下是安全的，多线程下是不安全的
 * @date :2020/3/12 12:19
 *
 *善于总结
 * 1.故障现象：java.util.ConcurrentModificationException
 * 2.导致原因：多线程操作集合类不安全
 * 3.解决方案：
 * List<String> list = new Vector();//Vector 是一个线程安全的类，效率低下
 *
 */
public class UnsafeList1 {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();//效率高，不支持并发
       // List<String> list = new Vector<>();//Vector 是一个线程线程安全的类，效率低下
       // List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList();//JUC推荐
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
