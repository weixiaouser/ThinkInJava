package juc.blocking;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/15 19:28
 *
 * 一直阻塞状态
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);

        //存放
        blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        //blockingQueue.put("d");

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());


    }
}
