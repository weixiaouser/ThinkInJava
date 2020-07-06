package juc.blocking;

import java.util.concurrent.SynchronousQueue;

/**
 * @author :weixiao
 * @description : 同步队列
 * @date :2020/3/16 10:19
 *
 * 每一个put 操作，必须等待一个take 否则无法继续添加元素
 */
public class Test5 {

    public static void main(String[] args) {

        SynchronousQueue<String> queue = new SynchronousQueue<>();

        //存
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+" put a");
                queue.put("a");
                System.out.println(Thread.currentThread().getName()+" put b");
                queue.put("b");
                System.out.println(Thread.currentThread().getName()+" put c");
                queue.put("c");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();
        //取
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+" "+queue.take());
                System.out.println(Thread.currentThread().getName()+" "+queue.take());
                System.out.println(Thread.currentThread().getName()+" "+queue.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

    }
}
