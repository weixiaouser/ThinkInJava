package juc.c_020;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :面试题
 * 实现一个容器，提供两个方法add，size 写两个线程
 * 线程1 添加10个元素到容器中
 * 线程2 实现实时监控元素个数，当个数到5个时，线程2 给出提示并结束
 * @date :2020/6/22 11:16
 */
public class T13_WithoutVolatile {

    volatile List list = new ArrayList<>();

    public void add(Object o){
        list.add(o);
    }

    public int  size(){
        return list.size();
    }

    public static void main(String[] args) {
        T13_WithoutVolatile c = new T13_WithoutVolatile();
        final Object lock = new Object();
        new Thread(()->{
            synchronized (lock) {
                System.out.println("t2 启动");
                if(c.size() != 5){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*for (int i = 0; i < 10; i++) {
                    c.add(new Object());
                    System.out.println("add " + i);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*/
            }
        },"t1").start();

        new Thread(()->{
            System.out.println("t2 启动");
            synchronized (lock) {
                while (true) {
                    if (c.size() == 5) {
                        break;
                    }
                }
            }
            System.out.println("t2 结束");
        },"t2").start();
    }
}
