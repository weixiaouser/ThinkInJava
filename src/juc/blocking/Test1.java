package juc.blocking;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author :weixiao
 * @description : 阻塞队列
 * @date :2020/3/15 18:37
 *
 *会抛出异常的
 */
public class Test1 {

    public static void main(String[] args) {
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
        //blockingQueue.add("d");//异常：java.lang.IllegalStateException: Queue full

        System.out.println(blockingQueue.element());//检查对首元素

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        //System.out.println(blockingQueue.remove());//java.util.NoSuchElementException
    }
}
