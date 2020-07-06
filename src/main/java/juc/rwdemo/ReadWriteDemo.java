package juc.rwdemo;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author :weixiao
 * @description :读写锁
 * @date :2020/3/15 12:59
 */
public class ReadWriteDemo {

    public static void main(String[] args) {
        MyData1 myData1 = new MyData1();
        //写入操作
        for (int i = 1; i <= 5; i++) {
            final int temp = i;
            new Thread(()->{
                myData1.put(temp+"",temp+"");
            },String.valueOf(i)).start();
        }

        //读取操作
        for (int i = 1; i <= 5; i++) {
            final int temp= i;
            new Thread(()->{
                myData1.get(temp+"");
            },String.valueOf(i)).start();
        }

    }
}
//线程操作资源类  存在问题，别的线程可能出现插队的现象
/*class MyData{
        HashMap<String,Object> map = new HashMap<>();

        public void put(String key,String value){
            System.out.println(Thread.currentThread().getName()+"写入"+key);
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+"写入"+value+"结束");
        }

        public void get(String key){
            System.out.println(Thread.currentThread().getName()+"读取"+key);
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取"+result+"结束");
        }
}*/

class MyData1{
    HashMap<String,Object> map = new HashMap<>();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    //写锁
    public void put(String key,String value){
        //lock.lock()
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"写入"+key);
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+"写入"+value+"结束");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.writeLock().unlock();//解锁
        }
    }

    //读锁
    public void get(String key){
        readWriteLock.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName()+"读取"+key);
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取"+result+"结束");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();//解锁
        }
    }
}
